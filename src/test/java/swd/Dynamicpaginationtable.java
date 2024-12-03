package swd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpaginationtable 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.linkText(" Login")).click();
		
		
	}

}
