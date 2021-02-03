package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.freshworks.com";
		df.launchUrl(url);
		
		//By footerLoc = By.cssSelector("ul.footer-nav>li>a");
		By footerLoc = By.cssSelector("ul.footer-nav li a");
		ElementUtil eu = new ElementUtil(driver);
		List<WebElement> footerEle = eu.getElements(footerLoc);
		System.out.println("Number of Footer links: " + footerEle.size());
		for(WebElement we: footerEle) {
			System.out.println(we.getText());
		}
		
		System.out.println("\n----Using Streams-----------");
		
		footerEle.stream().forEach(ele -> System.out.println(ele.getText()));
		
	}

}
