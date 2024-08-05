package swd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	    
		//name
		WebElement	searchbox=driver.findElement(By.name("search"));
	    searchbox.sendKeys("Macbook");
	    
	    //id
	    WebElement logo=driver.findElement(By.id("logo"));
	    boolean status=logo.isDisplayed();
	    System.out.println(status);
	    
	    //link text
	    driver.findElement(By.linkText("Tablets")).click();
	    
	    //classname
	    
	    List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
	    System.out.println(headerLinks.size());
	    
	    //tagname
	    
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    
	    List<WebElement> images=driver.findElements(By.tagName("img"));
	    System.out.println(images.size());
	    

	}

}
