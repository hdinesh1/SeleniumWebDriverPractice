package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterLinksList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		//String url = "https://www.google.com";
		String url = "https://www.freshworks.com";
		df.launchUrl(url);
		
		ElementUtil eu = new ElementUtil(driver);
		//By footer_loc = By.xpath("//*[@id=\"fbar\"]//a");
		By footer_loc = By.xpath("//*[@class=\"footer-main\"]//a");
		List<WebElement> footer_ele = eu.getElements(footer_loc);
		System.out.println("Size: " + footer_ele.size());
		for (WebElement we : footer_ele) {
			String listItems = we.getText();
			if (!listItems.isEmpty()) {
				System.out.println(we.getText());
			}
		}
		
		
	}

}
