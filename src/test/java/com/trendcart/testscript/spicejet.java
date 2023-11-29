package com.trendcart.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class spicejet {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
		//driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		driver.findElement(By.xpath("//div[text()='Bhavnagar']")).click();
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"));
		for(;;)
		{
		try {
		        driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' and text()='January '  and  text()='2024']/../..//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and text()='5']")).click();
		        break;
	         }
		catch(Exception e)
		{
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")).click();
		}
		}
		driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
		for(;;)
		{
		try
		{
           driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' and text()='June '  and text()='2024']/../..//div[ text()='15']")).click();
           break;
		}
		catch(Exception g)
		{
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")).click();	
		}
		}
	}

}
