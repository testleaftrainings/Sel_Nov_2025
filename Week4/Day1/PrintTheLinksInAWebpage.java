package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheLinksInAWebpage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
        //   0   1   2                     42
		//[WE1,WE2,WE3,   ,,,,,,,,,,,,,,,,WE43]
		int totalLinksCount = allElements.size();
		System.out.println("The Count is: "+totalLinksCount);
	}

}
