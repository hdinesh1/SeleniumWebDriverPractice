package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		
		//String url = "http://automationpractice.com/index.php";
		String url = "https://jqueryui.com/resources/demos/droppable/default.html";
		
		df.launchUrl(url);
		
		By draggable_loc = By.id("draggable");
		By droppable_loc = By.id("droppable");
		ElementUtil eu = new ElementUtil(driver);
		WebElement draggable_ele = eu.getElement(draggable_loc);
		WebElement droppable_ele = eu.getElement(droppable_loc);
		Actions act = new Actions(driver);
		//act.clickAndHold(draggable_ele).moveToElement(droppable_ele).release().build().perform();
		
		act.dragAndDrop(draggable_ele, droppable_ele).perform();
		System.out.println("Done");
		
		
	}
}
