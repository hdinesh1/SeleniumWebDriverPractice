package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private WebDriver driver;
	
	
	/**
	 * This method is used to initialize the WebDriver based on the Browser Name  
	 * @param browserName
	 * @return WebDriver 
	 */
	public WebDriver init_driver(String browserName) {
		System.out.println("Browser Name is: " + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else if (browserName.equalsIgnoreCase("opera")){
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please pass correct browserName name. browserName name passed is: " + browserName);
		}
		
		return driver;
	}
	
	/**
	 * This method is used to launch the URL passed
	 * @param url
	 */
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * This method returns a string containing the Title of the page - [getTitle()]
	 * @return String
	 */
	public String doGetPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method returns a string containing the current url of the page - [getCurrentUrl()]
	 * @return String
	 */
	public String doGetPageUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * This methods closes the browser - [close()]
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	/**
	 * This method quits the browser - [quit()]
	 */
	public void quitBrowser() {
		driver.quit();
	}

}
