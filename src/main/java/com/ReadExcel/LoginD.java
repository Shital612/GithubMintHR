package com.ReadExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginD {
	
	@Test(dataProvider = "credentials")
	public void verifyCredentials(String senario,String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://staging.dx0oqxblmo7a7.amplifyapp.com/dashboard";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.quit();
		 
	}
	@DataProvider(name="credentials")
	
	public Object[][] getData()
	{
		return new Object[][]
				{
			{"bothCorrect","superadmin@myorganization","Admin@123"},
			{"bothwrong","Admin123@gmail.com","admin@123"},
			{"CorrectuserName","superadmin@myorganization","admon@123"},
			{"CorrectPassword","supadmin@gmail.com","Admin@123"},
			
			
			
				};
	}

}
