package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JQueryDropDownHandleUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		String url = "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
		df.launchUrl(url);
		
		ElementUtil eu = new ElementUtil(driver);
		By choiceLoc = By.id("justAnInputBox1");
		eu.doClick(choiceLoc);
		By choiceListLoc = By.xpath("//span[@class='comboTreeItemTitle']");
		
		//eu.selectChoiceFromDropDown(choiceListLoc, "choice 2 1"); // single selection
		eu.selectChoiceFromDropDown(choiceListLoc, "choice 2 1","choice 2 3","choice 4","choice 6 2 3"); //multiple selection
		//eu.selectChoiceFromDropDown(choiceListLoc, "ALL");
		
	}

}
