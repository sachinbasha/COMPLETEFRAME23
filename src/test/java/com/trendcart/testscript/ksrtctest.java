package com.trendcart.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ksrtctest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[text()='7']")).click();

	}

}
