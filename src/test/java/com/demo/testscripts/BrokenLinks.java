package com.demo.testscripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException
	{
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for(int i=0;i<links.size();i++)
	    {
	    	WebElement link = links.get(i);
	    	String url = link.getAttribute("href");
	    	URL l=new URL(url);
	    	HttpURLConnection httpconn=(HttpURLConnection)l.openConnection();
	    	httpconn.connect();
	    	int responcecode=httpconn.getResponseCode();
	    	if(responcecode>=400)
	    	{
	    		System.out.println(url+"+------------------------>brken"+     responcecode);
	    	}
	    	else
	    	{
	    		System.out.println(url+" these are not broken links "+responcecode);
	    	}
	    	
	    
	    }
	    
	     
	     
	     
   }

}
