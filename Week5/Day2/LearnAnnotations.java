package week5.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	@Test
	public void createLead() {
		System.out.println("createLead");
    }
	
	@Test
	public void editLead() {
		System.out.println("editLead");
    }
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
    }
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
    }
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
    }
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
    }
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
    }
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
    }
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
    }
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
    }
	
	

}
