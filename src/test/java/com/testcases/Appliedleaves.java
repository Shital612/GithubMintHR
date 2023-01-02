package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Appliedleaves{

	@Test
	
	public void cancelleave() throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://production.dx0oqxblmo7a7.amplifyapp.com/login");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sheetal@mintinternational.tech");
		driver.manage().window().maximize();
		

		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Shital@2022");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
      
 
       WebElement leavs1= driver.findElement(By.xpath("//a[text()='Leaves']"));
       
        leavs1.click();
        
        driver.findElement(By.xpath("//a[text()='Applied Leaves']")).click();
        driver.findElement(By.xpath("//*[local-name()='svg' and @data-icon='edit']")).click();
        driver.findElement(By.className("float-right mb-3 mr-3 btn btn-primary")).click();
        
        
		
		
		
		
		
	}
	
	
}
