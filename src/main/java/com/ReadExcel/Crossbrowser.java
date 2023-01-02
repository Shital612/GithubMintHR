package com.ReadExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Crossbrowser {
	
	WebDriver driver;
	
	
	@Test
	@Parameters("browser")
	
	public void verifypageTitle(String browser)
	
	{
		if(browser.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_4.7.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/login");
		System.out.println(driver.getTitle());
		
	
		
	}
	
	
	
	
	
	
	
	
	  
	
	
	

}
