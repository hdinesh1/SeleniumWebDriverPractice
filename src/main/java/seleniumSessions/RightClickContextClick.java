package seleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
		df.launchUrl(url);
		
		By rigtClickLoc = By.xpath("//span[text()='right click me']");
		ElementUtil eu = new ElementUtil(driver);
		WebElement rightClickEle = eu.getElement(rigtClickLoc);
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).perform();
		
		By rightClickPopUpLoc = By.xpath("//ul/li[contains(@class,'context-menu-icon')]");
		List<WebElement> rightClickPopUpEle = eu.getElements(rightClickPopUpLoc);
		
		for (WebElement e:rightClickPopUpEle) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Copy")) {
				e.click();
				break;
			}
		}
	}

}
