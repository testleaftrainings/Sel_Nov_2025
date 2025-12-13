package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	@DataProvider
	public String[][] sendData() {
		String[][] data=new String[2][3];
		data[0][0]="Testleaf";
		data[0][1]="Vineeth";
		data[0][2]="Rajendran";
		
		data[1][0]="Qeagle";
		data[1][1]="Hari";
		data[1][2]="R";
		return data;

	}
	
	
	@Test(dataProvider = "sendData")
	public void createLead(String company, String firstname, String lastname) {
    	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
}
}
