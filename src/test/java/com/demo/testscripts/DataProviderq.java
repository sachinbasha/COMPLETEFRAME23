package com.demo.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderq
{
	@DataProvider(name="sachin") 
	public Integer[] test1()
	{
		Integer[]arr= {1,2,3};
		return arr;
	}
	@Test(dataProvider="sachin")
	public void test(int data)
	{
		System.out.println(data);
	}

}
