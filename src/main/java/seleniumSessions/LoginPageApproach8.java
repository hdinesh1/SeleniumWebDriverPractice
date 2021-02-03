package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageApproach8 {

	public static void main(String[] args) {
		
		DriverFactory df = new DriverFactory();
		String browserName = "opera";
		String url = "https://www.orangehrm.com/orangehrm-30-day-trial/";		
		
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl(url);
		System.out.println(df.doGetPageTitle());
		System.out.println(df.doGetPageUrl());
		
		By domain_id = By.id("Form_submitForm_subdomain");
		By fName_id = By.id("Form_submitForm_FirstName");
		By lName_id = By.id("Form_submitForm_LastName");
		By submit_btn_id = By.id("Form_submitForm_action_request");
		
		ElementUtil element = new ElementUtil(driver);
		element.doSendKeys(domain_id, "amazongoogle");
		element.doSendKeys(fName_id, "Elizabeth");
		element.doSendKeys(lName_id, "Banks");
		element.doClick(submit_btn_id);		

	}

}
