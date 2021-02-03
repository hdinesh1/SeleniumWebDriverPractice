package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAndSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "http://automationpractice.com/index.php";
		df.launchUrl(url);
		
		By search_loc = By.id("search_query_top");
		ElementUtil eu = new ElementUtil(driver);
		String search = "dress";
		eu.doSendKeys(search_loc, search);
		Thread.sleep(5000);
		By dropdown_loc = By.xpath("//*[@id=\"index\"]/div[2]//li");
		List<WebElement> dropdown_list = eu.getElements(dropdown_loc);
		System.out.println("Number of items in dropdown list: " + dropdown_list.size());
		for (WebElement we : dropdown_list) {
			System.out.println(we.getText());
			String locate = "Summer Dresses > Printed Chiffon Dress";
			if (we.getText().equalsIgnoreCase(locate)) {
				we.click();
				break;
			}
		}
		Thread.sleep(3000);
		By result_loc = By.xpath("//*[@id=\"center_column\"]//h1");
		WebElement result_ele = eu.getElement(result_loc);
		if (result_ele.getText().equalsIgnoreCase("Printed Chiffon Dress")) {
			System.out.println("Search worked correctly");
		}
		else {
			System.out.println("Search failed");
		}
	}

}
