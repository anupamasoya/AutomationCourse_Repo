package seleniumbasics;
    import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	public class Handlingfile extends Base {
		public void verifyFileUploadUsingSendKeys() {
			driver.navigate().to("https://demo.guru99.com/test/upload/");
			WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
			fileUpload.sendKeys("C:\\Users\\Anupama S\\git\\repository\\AutomationCourse\\src\\test\\resources\\Java.pdf");
					
			WebElement checkBox = driver.findElement(By.id("terms"));
			checkBox.click();
			WebElement submitButton = driver.findElement(By.id("submitbutton"));
			submitButton.click();

		}

		public void verifyFileUploadUsingRobotClass() throws AWTException {
			driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
			WebElement fileUpload = driver.findElement(By.id("pickfiles"));
			fileUpload.click();
			StringSelection se = new StringSelection("C:\\Users\\Anupama S\\git\\repository\\AutomationCourse\\src\\test\\resources\\Java.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);

			Robot r = new Robot();
			r.delay(2500); // 2500 ms
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void main(String[] args) {
			Handlingfile handlingFileUpload = new Handlingfile();
			handlingFileUpload.initializeBrowser();
			// handlingFileUpload.verifyFileUploadUsingSendKeys();
			// handlingFileUpload.browserCloseAndQuit();
			try {
				handlingFileUpload.verifyFileUploadUsingRobotClass();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


