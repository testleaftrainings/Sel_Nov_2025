package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/table.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//Count the number of rows
		//Count the number of columns
		//Retrieve a entire row data
		//Retrieve a entire column data
		//Retrieve a single data
		//Retrieve a entire table
		
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::div[@class='ui-datatable-scrollable-body']/table/tbody"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		//[WE1,WE2,    ,,,,,,,,,,,,,,WE10]
		
		int rowCount = allRows.size();
		System.out.println("The row count is : "+rowCount);
		
		//To count the column
		List<WebElement> allCoumns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		
		int columnCount = allCoumns.size();
		System.out.println("The column count is: "+columnCount);
		
		
		//To retrieve the entire row data
		List<WebElement> row2Data = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td"));
		//  0    1         5
		//[WE1, WE2,,,,,,,WE6]
		//        0    1    2   3   4   5
		for (int i = 0; i < row2Data.size(); i++) {
			String row2Text = row2Data.get(i).getText();
			System.out.println(row2Text);
			
		}
		
		
		//To retreive the entire table data
		List<WebElement> allEle = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td"));
	
	    for (int i = 0; i < allEle.size(); i++) {
	    	String allEleText = allEle.get(i).getText();
	    	System.out.println(allEleText);
		}
	
	}

}
