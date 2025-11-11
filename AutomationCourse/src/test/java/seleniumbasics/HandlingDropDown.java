package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	public void verifyDropDown(){
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown1 =driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropDown1);
		//select.selectByIndex(1);
		select.selectByValue("python");
		//select.selectByVisibleText("SQL");
	}
	
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox.click();
	}
	
	public void verifyRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='blue']"));
		radiobutton.click();
	}

	public static void main(String[] args) {
		HandlingDropDown hd = new HandlingDropDown();
		hd.initializeBrowser();
		hd.verifyDropDown();
		//hd.verifyCheckBox();
		//hd.verifyRadiobutton();

	}

}
