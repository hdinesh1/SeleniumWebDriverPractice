package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DropDownWithoutSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.orangehrm.com/orangehrm-30-day-trial/";
		df.launchUrl(url);
		
		By industry_loc = By.xpath("//*[@id=\"Form_submitForm_Industry\"]/option");
		By country_loc = By.xpath("//*[@id=\"Form_submitForm_Country\"]/option");
		ElementUtil eu = new ElementUtil(driver);
		eu.selectDropDownValue(industry_loc, "Retail / Wholesale");		
		eu.selectDropDownValue(country_loc, "India");
	}

}
