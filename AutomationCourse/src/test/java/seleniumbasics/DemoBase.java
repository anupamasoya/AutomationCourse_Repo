package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoBase {
	public WebDriver driver; // public (can access from everywhere) ,WebDriver is an interface ,driver is a
								// variable
	@BeforeMethod
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void browserCloseAndQuit() {
		// driver.close(); //closes only current tab
		driver.quit(); // close the entire browser and the session
	}
}
