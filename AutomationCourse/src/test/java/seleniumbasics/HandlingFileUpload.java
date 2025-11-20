package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	public void verifyFileUpload() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\Anupama S\\git\\repository\\AutomationCourse\\src\\test\\resources\\Java.pdf");

		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();

		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

	public void fileuploadusingRobotclass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileupload1 = driver.findElement(By.id("pickfiles"));
		fileupload1.click();
		StringSelection se = new StringSelection("C:\\Users\\Anupama S\\git\\repository\\AutomationCourse\\src\\test\\resources\\Java.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);
		
		
	Robot r =new Robot();	
	r.delay(2500);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		HandlingFileUpload file =new HandlingFileUpload();
		file.initializeBrowser();
		//file.verifyFileUpload();
		try {
			file.fileuploadusingRobotclass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}


