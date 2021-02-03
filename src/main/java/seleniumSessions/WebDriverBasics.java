package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Server to launch browser and pass commands between client and browser
		System.setProperty("webdriver.chrome.driver", "C:\\workfiles\\chromedriver_win32_87\\chromedriver.exe");
		
		//WebDriver is an interface
		//Top Casting
		WebDriver driver = new ChromeDriver();
		
		//http is required to launch a url
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		if (title.toLowerCase().contains("google")) {
			System.out.println("correct website is opened: " + title);
		} else {
			System.out.println("Incorrect website: " + title);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		//invalid session id after driver.close() -- Session ID is maintained and doesn't become null but server says that session ID is invalid since it is expired.
		//Session ID is null. Using WebDriver after calling quit() -- quit() makes the session ID as NULL
		System.out.println(driver.getTitle());
	}

}
