package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testclass 
{
	
	@Parameters("browser")
	@Test
	public void test1(String browser)
	{
		Reporter.log(browser+"chrome browser is launched test1",true);
		
     }
	
	
}


