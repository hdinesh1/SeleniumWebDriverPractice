package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopUpConceptUtil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		df.launchUrl(url);
		
		By jsAlertBtnLoc = By.xpath("//button[text()='Click for JS Alert']");
		By jsConfirmBtnLoc = By.xpath("//button[text()='Click for JS Confirm']");
		By jsPromtBtnLoc = By.xpath("//button[text()='Click for JS Prompt']");
		By resultLoc = By.id("result");
		
		ElementUtil eu = new ElementUtil(driver);
		
		System.out.println("Test 1\n------");
		eu.doClick(jsAlertBtnLoc);
		System.out.println(eu.getAlertText());
		WebElement resultEle = eu.getElement(resultLoc);
		if(resultEle.getText().equalsIgnoreCase("You successfuly clicked an alert")) {
			System.out.println("Alert was clicked in Alert popup");
		}
		
		Thread.sleep(3000);
		System.out.println("\nTest 2\n------");
		eu.doClick(jsAlertBtnLoc);
		eu.acceptAlert();
		if(resultEle.getText().equalsIgnoreCase("You clicked: Ok")) {
			System.out.println("Ok was clicked in Alert popup");
		}
		
		Thread.sleep(3000);
		System.out.println("\nTest 3\n------");
		eu.doClick(jsConfirmBtnLoc);
		eu.dismissAlert();
		if(resultEle.getText().equalsIgnoreCase("You clicked: Cancel")) {
			System.out.println("Cancel was clicked in Alert popup");
		}
		
		Thread.sleep(3000);
		System.out.println("\nTest 4\n------");
		eu.doClick(jsPromtBtnLoc);
		eu.sendTextToAlertAccept("Program accepted Alert");
		if(resultEle.getText().equalsIgnoreCase("You entered: Program accepted Alert")) {
			System.out.println(resultEle.getText());
		}
		
		Thread.sleep(3000);
		System.out.println("\nTest 5\n------");
		eu.doClick(jsPromtBtnLoc);
		eu.sendTextToAlertCancel("Program dismissed Alert");
		if(resultEle.getText().equalsIgnoreCase("You entered: null")) {
			System.out.println("Program dismissed Alert");
		}
	}

}
