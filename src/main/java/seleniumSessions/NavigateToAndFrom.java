package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToAndFrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("https://www.google.com");
		
		//navigate().to() method calls get() method.. so internally both as same and there is no difference.
		//with navigate() you can go back and forward
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh(); //to refresh the page
		
	}

}
