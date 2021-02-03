package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionClickAndSendKeysUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		String url = "https://demo.opencart.com/index.php?route=account/register";
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl(url);
		
		By fNameLoc = By.id("input-firstname");
		By lNameLoc = By.id("input-lastname");
		By loginLoc = By.linkText("Login");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doActionSendKeys(fNameLoc, "Gal");
		eu.doActionSendKeys(lNameLoc, "Gadot");
		eu.doActionClick(loginLoc);
	}

}
