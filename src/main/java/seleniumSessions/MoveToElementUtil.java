package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MoveToElementUtil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
	
		String url = "https://www.spicejet.com";
		df.launchUrl(url);
		
		By menuLoc = By.id("ctl00_HyperLinkLogin");
		Thread.sleep(5000);
		ElementUtil eu = new ElementUtil(driver);
		eu.doMoveToElement(menuLoc);
		Thread.sleep(3000);
		By subMenuLoc = By.xpath("//a[text()=\"SpiceClub Members\"]");
		eu.doMoveToElement(subMenuLoc);
		Thread.sleep(3000);
		By subMeuLoc2 = By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[17]/ul/li[2]/ul/li[1]/a");
		eu.doClick(subMeuLoc2);
		System.out.println("done");
		
	}

}
