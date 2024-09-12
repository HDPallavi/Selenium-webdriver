package swd;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindows 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        
		Set<String> windowids=driver.getWindowHandles();
		
		//Approach1
		
		List<String> windowlist=new ArrayList(windowids);
		
		String parentid=windowlist.get(0);
		String childid=windowlist.get(1);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		//Approad 2
		
		for (String d:windowlist)
		{
			String f=driver.switchTo().window(d).getTitle();
			System.out.println(f);
			
			if(f.equals("OrangeHRM")) 
			{
				System.out.println(	driver.getCurrentUrl());
				driver.close();
			}
		}
	}

}
