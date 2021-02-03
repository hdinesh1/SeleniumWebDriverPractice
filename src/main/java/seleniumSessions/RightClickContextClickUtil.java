package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RightClickContextClickUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
		df.launchUrl(url);
		
		By rightClickLoc = By.xpath("//span[text()='right click me']");
		ElementUtil eu = new ElementUtil(driver);
		eu.doRightClick(rightClickLoc);
		By rightClickMenuLoc = By.xpath("//ul/li[contains(@class,'context-menu-icon')]");
		List<String> rightClickMenuList = eu.getRightClickMenuList(rightClickMenuLoc);
		
		System.out.println("Number of options in list: " + rightClickMenuList.size());
		for (String str : rightClickMenuList) {
			System.out.println(str);
		}
		
		eu.selectRightClickOption(rightClickMenuLoc, "Paste");
	}

}
