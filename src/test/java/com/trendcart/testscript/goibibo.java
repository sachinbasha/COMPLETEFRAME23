package com.trendcart.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;)
		{
		try
		{
			driver.findElement(By.xpath("//div[text()='February 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='11']")).click();
			driver.findElement(By.xpath("//span[text()='Done']")).click();
			break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		for(;;)
		{
		try
		{
			driver.findElement(By.xpath("//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::div[@aria-label='Wed Jun 19 2024']")).click();
			driver.findElement(By.xpath("//span[text()='Done']")).click();
			break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
		}
	}


