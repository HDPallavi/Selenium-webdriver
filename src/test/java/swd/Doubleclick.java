package swd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe");
		
		WebElement box1=driver.findElement(By.id("field1"));
		WebElement box2=driver.findElement(By.id("field2"));
		WebElement button=driver.findElement(By.linkText("Copy Text"));
		
		
		box1.clear();
		box1.sendKeys("WELCOME");
		
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
	}

}
