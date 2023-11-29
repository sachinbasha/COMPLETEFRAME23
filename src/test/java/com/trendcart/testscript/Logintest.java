package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commandata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String email = p.getProperty("EmailAddress");
		String pwd = p.getProperty("Password");
		System.out.println(pwd);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
	   
	    
	}

}
