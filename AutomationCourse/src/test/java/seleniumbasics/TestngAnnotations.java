package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	@Test
	public void sampleTestCase() {
		System.out.println("Test Case");
	}
	
	@BeforeMethod
	public void beforeMethodSmaple() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethodSample() {
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	

	
}
