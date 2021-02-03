package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		
		//String url = "http://automationpractice.com/index.php";
		String url = "https://www.freshworks.com";
		
		df.launchUrl(url);
		
		By menuLoc = By.xpath("/html/body/header/nav/div/div/ul/li[2]/span");
		ElementUtil eu = new ElementUtil(driver);
		WebElement menuEle = eu.getElement(menuLoc);
		Actions act = new Actions(driver);
		act.moveToElement(menuEle).perform();
		//By subMenuLoc = By.xpath("/html/body/header/nav/div/div/ul/li[2]/ul/div/div/div[2]/div/li/ul/a[4]/li");
		By subMenuLoc = By.xpath("//li[text()=\"Events and notifications\"]");
		//By subMenuLoc = By.linkText("Events and notifications");
		WebElement subMenuEle = eu.getElement(subMenuLoc);
		System.out.println(subMenuEle.getText());
		subMenuEle.click();
		
	}

}
