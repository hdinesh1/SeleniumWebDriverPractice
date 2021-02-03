package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementContd {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Approach 1
		//Traditional Way
		//driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("google");
		
		//Approach 2
		/*
		WebElement domain_txt = driver.findElement(By.id("Form_submitForm_subdomain"));
		domain_txt.sendKeys("selenium");
		domain_txt.clear();
		domain_txt.sendKeys("Dinesh");
		*/
		
		//Approach 3
		//By Locators: Object Repository
		/*
		By domain_id = By.id("Form_submitForm_subdomain");
		By fName_id = By.id("Form_submitForm_FirstName");
		By lName_id = By.id("Form_submitForm_LastName");
		
		driver.findElement(domain_id).sendKeys("amazon");
		driver.findElement(fName_id).sendKeys("LeBron");
		driver.findElement(lName_id).sendKeys("James");
		*/
		
		//Approach 4
		//By Locators: Object Repository
		/*
		By domain_id = By.id("Form_submitForm_subdomain");
		By fName_id = By.id("Form_submitForm_FirstName");
		By lName_id = By.id("Form_submitForm_LastName");
		
		
		WebElement domain_ele = driver.findElement(domain_id);
		WebElement fName_ele = driver.findElement(fName_id);
		WebElement lName_ele = driver.findElement(lName_id);
		
		domain_ele.sendKeys("google");
		fName_ele.sendKeys("Shelly");
		lName_ele.sendKeys("Holmes");
		*/
		
		//Approach 5
		By domain_id = By.id("Form_submitForm_subdomain");
		By fName_id = By.id("Form_submitForm_FirstName");
		By lName_id = By.id("Form_submitForm_LastName");
		
		getElement(domain_id).sendKeys("google");
		getElement(fName_id).sendKeys("Neel");
		getElement(lName_id).sendKeys("Narayan");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
