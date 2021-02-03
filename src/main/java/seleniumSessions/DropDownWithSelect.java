package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownWithSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.orangehrm.com/orangehrm-30-day-trial/";
		df.launchUrl(url);
		
		By industry_loc = By.id("Form_submitForm_Industry");
		ElementUtil eu = new ElementUtil(driver);
		eu.doSelectByIndex(industry_loc, 3);
		eu.doSelectByVisibleText(industry_loc, "Computer / Technology - Services / Consultancy");
		eu.doSelectByValue(industry_loc, "Computer/Technology-Reseller");
		
		List<WebElement> indus_options = eu.doSelectGetOptions(industry_loc);
		for (WebElement we : indus_options) {
			System.out.println(we.getText());
		}
		
		//WebElement industry_ele = eu.getElement(industry_loc);
		
		/*
		Select select_ele = new Select(industry_ele);
		select_ele.selectByIndex(3);
		select_ele.selectByVisibleText("Computer / Technology - Services / Consultancy");
		select_ele.selectByValue("Computer/Technology-Reseller");
		*/
		
		/*
		List<WebElement> select_all = select_ele.getOptions();
		
		for (WebElement we : select_all) {
			System.out.println(we.getText());
		}*/
		
	}

}
