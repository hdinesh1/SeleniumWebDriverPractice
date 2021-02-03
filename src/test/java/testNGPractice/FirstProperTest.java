package testNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProperTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		driver.get("https:www.amazon.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
	}
	
	@Test (priority=1)
	public void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more.", title);
	}
	
	@Test (priority=2)
	public void logoTest() {
		WebElement logoEle = driver.findElement(By.id("nav-logo-sprites"));
		Boolean yesNo = logoEle.isDisplayed();
		Assert.assertTrue(yesNo, "Failed");
	}
	
	@Test (priority=3)
	public void footerLinks() {
		List<WebElement> footerEle = driver.findElements(By.xpath("//div[@class=\"navFooterLinkCol navAccessibility\"]//li"));
		int size = footerEle.size();
		System.out.println("Number of Footer Links: " + size);
		Assert.assertEquals(size, 31, "Incorrect number of Links");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
