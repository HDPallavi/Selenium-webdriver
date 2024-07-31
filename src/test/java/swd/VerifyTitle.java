package swd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle 
{

	@Test(priority=1)
	public static void main(String[] args) 
	{

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String actual_title=driver.getTitle();
       
        if(actual_title.equals("Your Store")) 
        {
        	System.out.println("test pass");
        }
        else 
        {
        	System.out.println("test fail");
        }
        
        driver.quit();
	}

}