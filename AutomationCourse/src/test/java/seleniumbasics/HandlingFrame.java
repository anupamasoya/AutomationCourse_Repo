package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrame extends Base {
	public void verifyframe() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrame frame = new HandlingFrame();
		frame.initializeBrowser();
		frame.verifyframe();

	}

}
