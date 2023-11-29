package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testclass2
{
	@Parameters("browser")
	@Test
	public void test2(String browser)
	{
		Reporter.log(browser+"chrome browser is launched test2",true);
	}

}
