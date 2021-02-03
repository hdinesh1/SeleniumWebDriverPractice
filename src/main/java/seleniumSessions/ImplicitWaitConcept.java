package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		String url = "https://www.crmpro.com";
		df.launchUrl(url);
		
		By usernameLoc = By.name("username");
		By passwordLoc = By.name("password");
		By loginBtnLoc = By.cssSelector("input[value='Login']");
		driver.findElement(usernameLoc).sendKeys("batchautomation"); //<----- implicit wait will be called here
		driver.findElement(passwordLoc).sendKeys("Test@12345");
		driver.findElement(loginBtnLoc).click();
		//ElementUtil eu = new ElementUtil(driver);
		//eu.doSendKeys(usernameLoc, "Test");
		
		
	}

}
