package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; //public (can access from everywhere) ,WebDriver is an  interface ,driver is a variable
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/"); 
		driver.manage().window().maximize();
		}
	
	public void browserCloseAndQuit() {
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		Base base =new Base();
		base.initializeBrowser();
		base.browserCloseAndQuit();
		
	}

}
