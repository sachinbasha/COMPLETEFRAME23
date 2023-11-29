package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest 
{
	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8197153122");
		driver.findElement(By.name("pass")).sendKeys("9611599505");
		driver.findElement(By.name("login")).click();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		    {
		    driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("8197153122");
			driver.findElement(By.name("pass")).sendKeys("9611599505");
			driver.findElement(By.name("login")).click();
			}
		
	}
	
	
	
	

}
