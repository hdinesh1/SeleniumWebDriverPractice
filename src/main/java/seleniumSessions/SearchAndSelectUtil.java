package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchAndSelectUtil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Google search program
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		
		//String url = "http://automationpractice.com/index.php";
		String url = "https://www.google.com";
		
		df.launchUrl(url);
		
		//By search_loc = By.id("search_query_top");
		By search_loc = By.name("q");
		
		ElementUtil eu = new ElementUtil(driver);
		String search = "naveen automation";
		
		eu.doSendKeys(search_loc, search);
		Thread.sleep(5000);
		//By dropdown_loc = By.xpath("//*[@id=\"index\"]/div[2]//li");
		By dropdown_loc = By.xpath("//ul[@class=\"erkvQe\"]/li//div[@class='sbl1']/span");
		
		//String locate = "Summer Dresses > Printed Chiffon Dress";
		String locate = "Naveen Automation labs Selenium interview questions";
		
		eu.selectDropDownValue(dropdown_loc, locate);
		
	}

}
