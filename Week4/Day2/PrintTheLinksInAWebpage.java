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
		
		WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
		String textOfButton = createAccountButton.getText();
		System.out.println(textOfButton);
		
		System.out.println("-------------------");
		
	   List<WebElement> allElements = driver.findElements(By.tagName("a"));
        //   0   1   2                     42
		//[WE1,WE2,WE3,   ,,,,,,,,,,,,,,,,WE43]
		int totalLinksCount = allElements.size();
		System.out.println("The Count is: "+totalLinksCount);
		//           0   1   2,,,,,,,,,42
		for (int i = 0; i <totalLinksCount ; i++) {
			String allText = allElements.get(i).getText();
			System.out.println(allText);
			//String allText1 = allElements.get(0).getText();
			//String allText2 = allElements.get(1).getText();
			//String allText3 = allElements.get(2).getText();
			//String allText43 = allElements.get(42).getText();
		}
	}

}
