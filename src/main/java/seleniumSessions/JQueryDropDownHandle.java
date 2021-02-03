package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println("Total items in list: " + choiceList.size());
		
		for(WebElement we:choiceList) {
			String choiceText = we.getText();
			System.out.println(choiceText);
			if (choiceText.equalsIgnoreCase("choice 6 2")) {
				we.click();
				break;
			}
		}
	}

}
