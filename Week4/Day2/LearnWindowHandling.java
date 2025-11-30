package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/window.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click  on the Button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowhandles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The set is: "+windowHandles);
		//               0                                 1
		//[DA16A8BBC534A45B298EC856E6A93144, 1B2A0F83A3A4DAD8B8CD18F20C9CF507]
		
		//               0                                  1
		//[4184B616D00CBB5DF47181EDBBF58F30, EF0C2090A79511CA0AA6FF7973E25ED5]
		
		
		//Convert to List
		List<String> allAddress =new ArrayList<String>(windowHandles);
		String address = allAddress.get(1);
		
		String titleBeforeSwitching = driver.getTitle();
		System.out.println(titleBeforeSwitching);
		
		
		driver.switchTo().window(address);
		
		String titleAfterSwitching = driver.getTitle();
		System.out.println(titleAfterSwitching);
		
		//Close the browser
		driver.close();
		//driver.quit();
		
		driver.switchTo().window(allAddress.get(0));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
