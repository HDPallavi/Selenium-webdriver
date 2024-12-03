package swd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtable 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
		
		
		List<WebElement> columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		System.out.println(columns.size());
		
		for (WebElement rowElement : rows) 
		{
	         List<WebElement> cells = rowElement.findElements(By.tagName("td"));

	         // Iterate through each cell in the row
	         for (WebElement cellElement : cells) {
	            String cellData = cellElement.getText();
	            // Process the cell data as needed
	            System.out.print(cellData + "\t");
	         }

	         // Move to the next line after processing each row
	         System.out.println();
	      }
		
	}

}
