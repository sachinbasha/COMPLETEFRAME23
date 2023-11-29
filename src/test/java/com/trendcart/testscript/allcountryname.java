package com.trendcart.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allcountryname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> teamname = driver.findElements(By.xpath("//table//tbody/tr/td[2]/span[2]"));
		int count=teamname.size();
		List<WebElement> position = driver.findElements(By.xpath("//table//tbody/tr/td[1]"));
		for(int i=0;i<count;i++)
		{
			String s = teamname.get(i).getText();
			String z = position.get(i).getText();
			System.out.println(s+"..........................."+z);

		}
		

	}

}
