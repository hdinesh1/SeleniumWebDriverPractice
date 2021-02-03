package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Store"));
		System.out.println(driver.getTitle());
	}

}
