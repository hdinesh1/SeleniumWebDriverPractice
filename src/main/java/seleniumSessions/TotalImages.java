package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.amazon.com";
		df.launchUrl(url);
		
		By img_loc = By.tagName("img");
		ElementUtil eu = new ElementUtil(driver);
		List<WebElement> img_list = eu.getElements(img_loc);
		
		System.out.println("Number of images are: " + img_list.size());
		
		for (WebElement we : img_list) {
			String txt = we.getAttribute("alt");
			String src_links = we.getAttribute("src");
 			System.out.println(txt + " --> " + src_links);
		}
		
	}

}
