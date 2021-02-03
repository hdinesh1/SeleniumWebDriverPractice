package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KayakSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.kayak.com/flights";
		df.launchUrl(url);
		
		By fromEnterLoc = By.xpath("(//input[contains(@id,'-origin-airport')])[1]");
		By fromLoc = By.xpath("(//div[contains(@id,'-origin-airport-display')])[1]");
		By fromDispLoc = By.xpath("(//div[contains(@id,'-origin-airport-smarty-multi-container')])[1]");
		By fromCheckLoc = By.xpath("//input[contains(@id,'multiAirportCheckbox-CLE')]");
		By toLoc = By.xpath("(//div[contains(@id,'-destination-airport-display')])[3]");
		
		ElementUtil eu= new ElementUtil(driver);
		Thread.sleep(5000);
		//eu.doClick(fromLoc);
		eu.doActionClick(fromLoc);
		eu.doSendKeys(fromEnterLoc, "Cleveland");
		eu.doActionClick(fromCheckLoc);
		Thread.sleep(5000);
		//eu.doActionClick(fromDispLoc);
		//Thread.sleep(5000);
		eu.doActionSendKeys(fromEnterLoc, "Bangalore");
		By realFromLoc = By.xpath("//li[contains(@id,'BLR')]");
		eu.doActionClick(realFromLoc);
		
		eu.doActionSendKeys(toLoc, "Cleveland");
		By realToLoc = By.xpath("//li[contains(@id,'CLE')]");
		eu.doActionClick(realToLoc);
	}

}
