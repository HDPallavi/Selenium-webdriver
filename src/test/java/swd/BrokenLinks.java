package swd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for (WebElement linkElement:links) 
		{
			String hrefvalue=linkElement.getAttribute("href");
			
			URL linkurl=new URL(hrefvalue);
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400) 
			{
				System.out.println("broken");
			}
			else 
			{
				System.out.println("not broken");
			}
		}
		

	}

}
