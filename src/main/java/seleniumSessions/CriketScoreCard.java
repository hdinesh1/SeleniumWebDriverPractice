package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriketScoreCard {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Opera";
		DriverFactory df = new DriverFactory();
		driver = df.init_driver(browserName);
		String url = "https://www.espncricinfo.com/series/india-in-australia-2020-21-1223867/australia-vs-india-2nd-test-1223870/full-scorecard";
		df.launchUrl(url);
		
		//ElementUtil eu = new ElementUtil(driver);
		//By wicketTakerLoc = By.xpath("//a[text()='Cheteshwar Pujara']//parent::td//following-sibling::td/span");
		//WebElement wicketTakerEle = eu.getElement(wicketTakerLoc);
		//System.out.println(wicketTakerEle.getText());
		System.out.println(getScoreCard("Cheteshwar Pujara"));
		System.out.println(getScoreCard("Shubman Gill"));
		
	}
	
	public static List<String> getScoreCard(String playerName) {
		ElementUtil eu = new ElementUtil(driver);
		By scoreLoc = By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td//following-sibling::td");
		List<WebElement> scoreEle = eu.getElements(scoreLoc);
		List<String> scoreList = new ArrayList<String>();
		for(WebElement we:scoreEle) {
			if(!we.getText().isEmpty()) {
				scoreList.add(we.getText());
			}
		}
		return scoreList;
	}

}
