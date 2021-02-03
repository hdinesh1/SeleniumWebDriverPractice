package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopupConecpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		df.launchUrl(url);
		
		By signInLoc = By.name("proceed");
		ElementUtil eu = new ElementUtil(driver);
		eu.doClick(signInLoc);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//System.out.println(alert.getText()); // gives Error as alert is not shown
		driver.switchTo().defaultContent();
		//System.out.println(alert.getText()); // gives Error as alert is not shown
		
	}

}
