package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LeavemoduelTest {
	WebDriver driver;
	
	
	@Test
	public void LeaveTest() throws InterruptedException
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
        
        
        
        driver.findElement(By.linkText("Apply for leave")).click();
        
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        Thread.sleep(2000);
        
             
    	
        WebElement ddele=driver.findElement(By.className("custom-select"));
        ddele.click();
        
        
        
                
                Select select=new Select(ddele);
             select.selectByVisibleText("Leave without pay");
             
             
             driver.findElement(By.xpath("//input[@placeholder='Note']")).sendKeys("Earn Leave");
               
                
                driver.findElement(By.xpath("//*[@id=\"from_date\"]")).sendKeys("12/21/2022");
                
                Thread.sleep(2000);
                
                driver.findElement(By.xpath("//*[@id=\"end_date\"]")).sendKeys("12/24/2022");
                
                Thread.sleep(2000);
                
                
                
                driver.findElement(By.xpath("//button[@class='float-right mb-3 btn btn-primary']")).click();
                
                
                
	}
	

	
		

        
      
       
		
		
		
		


		
		
	}
	
	


