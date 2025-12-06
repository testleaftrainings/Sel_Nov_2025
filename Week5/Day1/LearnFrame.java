package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		        //Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/frame.xhtml");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				//Switch the focus
				//driver.switchTo().frame(0);
			    WebElement frameEle = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']/following-sibling::iframe"));
				driver.switchTo().frame(frameEle);
				
				//Click on the Button'
				driver.findElement(By.id("Click")).click();

	}

}
