package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Switch the driver focus
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Alert will be handled");
		
		promptAlert.accept();
		

	}

}
