package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeDriverManagerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("https://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("Current url is: " + driver.getCurrentUrl());
		driver.quit();
	}

}
