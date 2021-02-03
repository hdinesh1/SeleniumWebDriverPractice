package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebDriverWaitConceptUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		String url = "https://www.dollartree.com";
		df.launchUrl(url);
		
		ElementUtil eu = new ElementUtil(driver);
		String title = eu.waitForPageTitleContains("Dollar", 10);
		System.out.println("Title is: "+title);
		
		df.launchUrl("https://www.kayak.com");
		title = eu.waitForPageTitleMatch("Search Flights, Hotels & Rental Cars | KAYAK", 10);
		System.out.println("New Title is: "+title);
	}

}
