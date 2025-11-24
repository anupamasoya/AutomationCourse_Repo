package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.DemoBase;
import utility.ExcelUtility;

//page design
public class LoginTest extends DemoBase {
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() throws IOException {
		String usernamevalue = ExcelUtility.readStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNamefield(usernamevalue);

		loginPage.enterPasswordOnPasswordField(passwordvalue);
		loginPage.loginButtonClick();
	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUserNameandInvalidPassword() throws IOException {
		String usernamevalue = ExcelUtility.readStringData(1, 0, "LoginPage");
		String passwordvalue = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNamefield(usernamevalue);

		loginPage.enterPasswordOnPasswordField(passwordvalue);
		loginPage.loginButtonClick();
	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUserNameandValidPassword() throws IOException {
		String usernamevalue = ExcelUtility.readStringData(2, 0, "LoginPage");
		String passwordvalue = ExcelUtility.readStringData(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNamefield(usernamevalue);

		loginPage.enterPasswordOnPasswordField(passwordvalue);
		loginPage.loginButtonClick();
	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUserNameandInValidPassword() throws IOException {
		String usernamevalue = ExcelUtility.readStringData(3, 0, "LoginPage");
		String passwordvalue = ExcelUtility.readStringData(3, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNamefield(usernamevalue);

		loginPage.enterPasswordOnPasswordField(passwordvalue);
		loginPage.loginButtonClick();
	}

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
 * 
 * @Test public void
 * verifyWhetherUserIsAbleToLoginWithValidUserNameandInvalidPassword(){
 * WebElement userName = driver.findElement(By.id("user-name"));
 * userName.sendKeys("locked_out_user");
 * 
 * WebElement password = driver.findElement(By.id("password"));
 * password.sendKeys("anu@123");
 * 
 * WebElement loginButton = driver.findElement(By.id("login-button"));
 * loginButton.click();
 * 
 * }
 * 
 * @Test public void
 * verifyWhetherUserIsAbleToLoginWithInValidUserNameandValidPassword() {
 * WebElement userName = driver.findElement(By.id("user-name"));
 * userName.sendKeys("Stranger");
 * 
 * WebElement password = driver.findElement(By.id("password"));
 * password.sendKeys("secret_sauce");
 * 
 * WebElement loginButton = driver.findElement(By.id("login-button"));
 * loginButton.click();
 * 
 * }
 * 
 * @Test public void
 * verifyWhetherUserIsAbleToLoginWithInValidUserNameandInValidPassword() {
 * WebElement userName = driver.findElement(By.id("user-name"));
 * userName.sendKeys("Stranger");
 * 
 * WebElement password = driver.findElement(By.id("password"));
 * password.sendKeys("Anu@123");
 * 
 * WebElement loginButton = driver.findElement(By.id("login-button"));
 * loginButton.click();
 * 
 * }
 */
