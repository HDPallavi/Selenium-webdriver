package swd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("laptop");
		
		
		//tag classname
		driver.findElement(By.cssSelector("input.search-box-text ui-autocomplete-input")).sendKeys("laptop");
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("laptop");
		
		//tag class name attribute
		driver.findElement(By.cssSelector("input.search-box-text ui-autocomplete-input[placeholder='Search store']")).sendKeys("laptop");
	}

}
