package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "edge";
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\workfiles\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\workfiles\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		} 
		else {
			System.out.println("Invalid Browser Name");
		}
		driver.get("http://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("Current url is: " + driver.getCurrentUrl());
		driver.quit();
	}
}
