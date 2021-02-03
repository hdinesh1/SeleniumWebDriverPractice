package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "http://tutorialsninja.com/demo/index.php?route=account/register";
		df.launchUrl(url);
		
		By fName_txt = By.id("input-firstname");
		By lName_txt = By.id("input-lastname");
		By email_txt = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By conf_pwd = By.id("input-confirm");
		By cont_btn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(fName_txt, "Mandy");
		eu.doSendKeys(lName_txt, "Rose");
		eu.doSendKeys(email_txt, "mandyrose@wwe.com");
		eu.doSendKeys(telephone, "2168418956");
		eu.doSendKeys(pwd, "Dine!234");
		eu.doSendKeys(conf_pwd, "Dine!234");
		eu.doClick(cont_btn);
		
	}

}
