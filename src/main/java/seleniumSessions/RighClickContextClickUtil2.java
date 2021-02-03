package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RighClickContextClickUtil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
		df.launchUrl(url);
		
		By rightClickLoc = By.xpath("//span[text()='right click me']");
		By rightClickMenuLoc = By.xpath("//ul/li[contains(@class,'context-menu-icon')]");
		ElementUtil eu = new ElementUtil(driver);
		List<String> rightClickMenuList = eu.rightClickAndMenuList(rightClickLoc, rightClickMenuLoc);
		
		System.out.println("Number of options in list: " + rightClickMenuList.size());
		System.out.println(rightClickMenuList);
		for (String str : rightClickMenuList) {
			System.out.println(str);
		}
		
		eu.rightClickAndSelectOption(rightClickLoc, rightClickMenuLoc, "Paste");
	}

}
