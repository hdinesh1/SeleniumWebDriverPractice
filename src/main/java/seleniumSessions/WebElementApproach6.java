package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementApproach6 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Approach 6
		
		By domain_id = By.id("Form_submitForm_subdomain");
		By fName_id = By.id("Form_submitForm_FirstName");
		By lName_id = By.id("Form_submitForm_LastName");
		By submit_btn_id = By.id("Form_submitForm_action_request");
		//*
		doSendKeys(domain_id, "amazongoogle");
		doSendKeys(fName_id, "Elizabeth");
		doSendKeys(lName_id, "Banks");
		doClick(submit_btn_id);
		
	}
	
	
	//Custom Wrapper Methods

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String str) {
		getElement(locator).sendKeys(str);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
