package swd;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod 
{
  public static void main(String[] args) 
    
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	String str1=driver.getWindowHandle();
	System.out.println(str1);
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	Set<String> str2=driver.getWindowHandles();
	System.out.println(str2);
	
    }
			
	
}
