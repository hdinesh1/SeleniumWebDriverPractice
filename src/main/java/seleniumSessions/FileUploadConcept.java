package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FileUploadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "opera";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		//File Upload will work only if the button has attribute of type='file. HTML doesn't matter. If type='file' is not present then cannot be automated.
		String url = "https://the-internet.herokuapp.com/upload";
		df.launchUrl(url);
		
		By chooseFileLoc = By.name("file");
		By uploadLoc = By.id("file-submit");
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(chooseFileLoc, "C:\\Users\\WishDin\\Documents\\Testdoc.txt");
		eu.doClick(uploadLoc);
		By h3headerLoc = By.xpath("//h3");
		String text = eu.doGetText(h3headerLoc);
		System.out.println(text);
	}

}
