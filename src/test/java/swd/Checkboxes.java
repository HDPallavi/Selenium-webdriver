package swd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select check box
		
		WebElement box1=driver.findElement(By.id("sunday"));
		System.out.println("check selected or not"+ box1.isSelected());
		box1.click();
		System.out.println("check selected or not"+ box1.isSelected());
		
		//capture all check boxes
		
		List<WebElement> boxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(boxes.size());
		
		//select all checkboxes
		
		for (int i=0;i<boxes.size();i++) 
		{
			boxes.get(i).click();
		}
		
		for(WebElement cb:boxes) 
		{
			cb.click();
		}
		
		//select last or first
		
		for (int i=4; i<boxes.size();i++) 
		{
			boxes.get(i).click();
		}
		
		for (int i=0;i<3;i++) 
		{
			boxes.get(i).click();
		}
		
		//select randomly
		
		for (int i=0; i<boxes.size();i++) 
		{
			if(i==1 || i==3 || i==7) 
			{
				boxes.get(i).click();
			}
		}
	}
	

}
