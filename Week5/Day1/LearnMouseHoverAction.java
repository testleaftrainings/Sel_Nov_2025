package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHoverAction {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.pvrcinemas.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//Step1:Create Object for actions class
		Actions act=new Actions(driver);
		
		//Step2:Finding the element
		WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));
		
		//Use the method for Mouse Hover -moveToElement
		act.moveToElement(mouseHoverElement).perform();
		
	}

}
