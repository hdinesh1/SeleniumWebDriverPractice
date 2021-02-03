package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessModeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		WebDriverManager.operadriver().setup();
		OperaOptions oo = new OperaOptions();
		oo.addArguments("--headless");
		WebDriver driver = new OperaDriver(oo);
		*/
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
