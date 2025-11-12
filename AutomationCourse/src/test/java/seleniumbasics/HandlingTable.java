package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base {
	public void verifyTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable")); // full table -> printed
		System.out.println(table.getText());

		WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]")); // single
																									// row->printed

		System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		HandlingTable table = new HandlingTable();
		table.initializeBrowser();
		table.verifyTable();

	}

}
