package swd;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationalmethods 
{
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
