package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Added a new comment to check in GIT
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		String url = "https://demo.opencart.com/index.php?route=account/register";
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl(url);
		
		By fNameLoc = By.id("input-firstname");
		By lNameLoc = By.id("input-lastname");
		By loginLoc = By.linkText("Login");
		
		ElementUtil eu = new ElementUtil(driver);
		Actions act = new Actions(driver);
		WebElement fNameEle = eu.getElement(fNameLoc);
		WebElement lNameEle = eu.getElement(lNameLoc);
		WebElement loginEle = eu.getElement(loginLoc);
		act.sendKeys(fNameEle, "Kristen").perform();;
		act.sendKeys(lNameEle, "Bell").perform();;
		act.click(loginEle).perform();
	}

}
