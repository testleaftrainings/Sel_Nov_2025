package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/alert.xhtml");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//span[text()='Show']")).click();
				
				//driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
				Alert simpleAlert = driver.switchTo().alert();
				
				String text = simpleAlert.getText();
				System.out.println(text);
				
				simpleAlert.accept();
				
				
				

	}

}
