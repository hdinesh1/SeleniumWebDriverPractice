package seleniumSessions;

import org.openqa.selenium.WebDriver;

public class AuthPopUpConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		//Make sure that password doesn't have @ symbol else it won't work.
		String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		df.launchUrl(url);
	}

}
