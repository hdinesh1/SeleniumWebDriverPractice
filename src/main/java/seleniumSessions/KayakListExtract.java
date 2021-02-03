package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KayakListExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.kayak.com/flights";
		df.launchUrl(url);
		
		By seoFlightLoc = By.xpath("//div[@class='SeoLinks__column js-column']//a");
		
		ElementUtil eu = new ElementUtil(driver);
		System.out.println("All Links");
		List<WebElement> seoFlightListEle = eu.getElements(seoFlightLoc);
		System.out.println(seoFlightListEle.size());
		for(WebElement we:seoFlightListEle) {
			if (!we.getText().isEmpty()) {
				System.out.println(we.getText());
			}
		}
		
		System.out.println("\n2nd Column Links");
		By seo2ndColFlightLoc = By.xpath("//div[@class='SeoLinks__column js-column'][2]//a");
		List<WebElement> seo2ndColFlightListEle = eu.getElements(seo2ndColFlightLoc);
		System.out.println(seo2ndColFlightListEle.size());
		for(WebElement we:seo2ndColFlightListEle) {
			if (!we.getText().isEmpty()) {
				System.out.println(we.getText());
			}
		}
	}

}
