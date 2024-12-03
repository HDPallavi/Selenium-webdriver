package swd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
		driver.manage().window().maximize();
		
		String file1="D:\\test.odt";
		String file2="D:\\test1.odt";
				
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
		

	}

}
