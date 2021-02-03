package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H3Header {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverFactory df = new DriverFactory();
		String browserName = "opera";
		//String url = "http://classic.crmpro.com";
		String url = "https://www.amazon.com";
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl(url);
		
		By h3header = By.tagName("h3");
		By links = By.tagName("a");
		
		ElementUtil eu = new ElementUtil(driver);
		List<WebElement> h3Elements = eu.getElements(h3header);
		List<WebElement> linkslist = eu.getElements(links);
		
		System.out.println("Number of H3 Headers are: " + h3Elements.size());
		System.out.println("List of H3 Headers");
		for (WebElement we : h3Elements) {
			System.out.println(we.getText());
		}
		/*
		for (int i=0;i<h3Elements.size();i++) {
			System.out.println(h3Elements.get(i).getText());
		}*/
		
		System.out.println("-----------------------------------------");
		System.out.println("Number of Links are: " + linkslist.size());
		for (WebElement we : linkslist) {
			String txt = we.getText();
			if (!txt.isEmpty()) {
				System.out.println(we.getText());
				System.out.println(we.getAttribute("href"));
				
			}			
		}
	}

}
