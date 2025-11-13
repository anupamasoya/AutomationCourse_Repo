package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingalert extends Base {
	public void verifysimplealert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void verifyconfirmalert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert al = driver.switchTo().alert();
		al.dismiss();

	}

	public void verifypromptalert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Anu");
		al.accept();

	}

	public static void main(String[] args) {
		Handlingalert alert = new Handlingalert();
		alert.initializeBrowser();
		// alert.verifysimplealert();
		// alert.verifyconfirmalert();
		alert.verifypromptalert();

	}

}
