package com.trendcart.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cricbuzz {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@title='Live Cricket Score']")).click();
		List<WebElement> c = driver.findElements(By.xpath("//h2[@ng-show='match.miniscore.bowling.score']/../h2"));
		for(int i=0;i<c.size();i++)
		{
			Thread.sleep(2000);
			String livescores = c.get(i).getText();
			System.out.println(livescores);
		}
	}

}
