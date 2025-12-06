package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollActions {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://www.amazon.in/");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//Create Object
				Actions act=new Actions(driver);
				
				//Find the Element
				WebElement scrollEle = driver.findElement(By.linkText("Conditions of Use & Sale"));
				
               //Use the method scroll-scrollToElement
				act.scrollToElement(scrollEle).perform();
	}

}
