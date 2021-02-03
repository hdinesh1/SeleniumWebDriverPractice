package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerCrossBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "firefox";
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\workfiles\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browser.equals("edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\workfiles\\edgedriver_win64\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else if (browser.equals("opera")){
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser Name");
		}
		driver.get("http://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("Current url is: " + driver.getCurrentUrl());
		//driver.quit();
		driver.close();
		
	}

}
