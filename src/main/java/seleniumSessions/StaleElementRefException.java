package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementRefException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.google.com";
		
		df.launchUrl(url);
		
		//By search_loc = By.id("search_query_top");
		By search_loc = By.name("q");
		
		ElementUtil eu = new ElementUtil(driver);
		String search = "naveen automation";
		
		WebElement searchEle = eu.getElement(search_loc);
		searchEle.sendKeys(search);
		driver.navigate().refresh();
		searchEle = eu.getElement(search_loc); // If Element is not found again then StaleElementReferenceException will be thrown.
		searchEle.sendKeys("Wonder Woman");
		
		
	}

}
