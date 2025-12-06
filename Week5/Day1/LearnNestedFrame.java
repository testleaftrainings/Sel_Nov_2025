package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/frame.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//switch to outer frame
		driver.switchTo().frame(2);
		
		//Switch to inner frame
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frame2");
		
		//Click the element
		driver.findElement(By.id("Click")).click();
		
	    //Switch the focus to main webpage
		driver.switchTo().defaultContent();
		
		//switch the focus to parent frame
		driver.switchTo().parentFrame();
		
		
	}

}
