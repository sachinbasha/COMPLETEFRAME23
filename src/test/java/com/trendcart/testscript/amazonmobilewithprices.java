package com.trendcart.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class amazonmobilewithprices {
	public static void main(String[] args) throws InterruptedException ,NumberFormatException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone"+Keys.ENTER);
	List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../..//div[@class='col col-5-12 nlI3QM']//div[@class='_25b18c']/div"));
	List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
    int count = name.size();
     for(int i=0;i<count;i++)
     {
    	String mobileprice = price.get(i).getText();
    	String v = mobileprice.substring(1);
    	String mobilename=name.get(i).getText();
    	int k = Integer.parseInt(v);
    	if(k>50000)
    	{
    		System.out.println(mobileprice+" "+mobilename);
    	}
     }
     
	}

}
