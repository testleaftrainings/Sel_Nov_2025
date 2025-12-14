package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;
	
	public String filename;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preConditions(String URL,String user,String pass) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	@AfterMethod
	public void postConditions() {
		driver.close();

	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		String[][] readData = ReadExcel.readData(filename);    //CreateLead
         return readData;
	}

}
