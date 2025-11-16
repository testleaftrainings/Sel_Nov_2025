package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Step1: Launch the Browser
		ChromeDriver driver = new ChromeDriver(options);

		// Step2: Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step3: Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Step4:Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Step5:Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Step6:Clcik the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Step7: Click the CRMSFA link
		// driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();

		// Step8: Click the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Step9: Click the Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Step10: Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Step10: Enter the Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		// Step11: Enter the Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

		// Select the value from Dropdown
		// find the element
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Create an object for Select Class
		Select dropdownOptions = new Select(sourceDropdown);

		// Use the method to select
		// By index
		// dropdownOptions.selectByIndex(2);

		// By Value
		// dropdownOptions.selectByValue("LEAD_EMPLOYEE");

		// By Visible text
		dropdownOptions.selectByVisibleText("Public Relations");

		Thread.sleep(5000);
		driver.findElement(By.name("submitButton")).click();

	}

}
