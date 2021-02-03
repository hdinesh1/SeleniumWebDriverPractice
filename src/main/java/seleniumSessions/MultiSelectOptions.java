package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiSelectOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.orangehrm.com/orangehrm-30-day-trial/";
		df.launchUrl(url);
		
		By industry_loc = By.id("Form_submitForm_Industry");
		ElementUtil eu = new ElementUtil(driver);
		eu.selectDropdownByDiffOptions(industry_loc, DropdownSelect.INDEX.toString(), "5");
		eu.selectDropdownByDiffOptions(industry_loc, DropdownSelect.VALUE.toString(), "Computer/Technology-Reseller");
		eu.selectDropdownByDiffOptions(industry_loc, DropdownSelect.VISIBLETEXT.toString(), "Healthcare");
	}

}
