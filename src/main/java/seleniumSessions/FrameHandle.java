package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "http://www.londonfreelance.org/courses/frames/index.html";
		df.launchUrl(url);
		
		driver.switchTo().frame(2);
		By headerLoc = By.xpath("/html/body/h2");
		ElementUtil eu = new ElementUtil(driver);
		WebElement headerEle = eu.getElement(headerLoc);
		System.out.println(headerEle.getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("navbar");
		By linkLoc = By.xpath("/html/body//a");
		List<WebElement> linkEle = eu.getElements(linkLoc);
		for (WebElement we : linkEle) {
			System.out.println(we.getText());
		}
		driver.switchTo().defaultContent();
		
	}

}
