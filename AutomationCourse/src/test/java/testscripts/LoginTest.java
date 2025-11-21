package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.DemoBase;

public class LoginTest extends DemoBase {
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() { // Pagedesign
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNamefield();
		loginPage.enterPasswordOnPasswordField();
		loginPage.loginButtonClick();
	}

	/*
	 * @Test public void verifyWhetherUserIsAbelToLoginWithValidCredentials() {
	 * 
	 * //WebElement userName =driver.findElement(By.id("user-name"));
	 * userName.sendKeys("standard_user");
	 * 
	 * WebElement password = driver.findElement(By.id("password"));
	 * password.sendKeys("secret_sauce");
	 * 
	 * WebElement loginButton =driver.findElement(By.id("login-button"));
	 * loginButton.click(); }
	 */
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUserNameandInvalidPassword() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("locked_out_user");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("anu@123");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUserNameandValidPassword() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("Stranger");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUserNameandInValidPassword() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("Stranger");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Anu@123");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

	}

}
