package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementApproach7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Approach 7
		
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
