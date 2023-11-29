
package com.trendcart.testscript;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		List<WebElement> alllins = driver.findElements(By.xpath("//a"));
	    int count=alllins.size();
	    System.out.println(count+" all links");
	    ArrayList<String> list=new ArrayList<String>();
	    for(WebElement c:alllins)
	   {
		   int statuscode=0;
          String eachlinks = c.getAttribute("href"); 
          try
          {
               URL url=new URL(eachlinks);
               HttpURLConnection a=(HttpURLConnection)url.openConnection();
                statuscode = a.getResponseCode();
                 if(statuscode>=400)
                 {
        	          list.add(eachlinks);
        	          System.out.println(statuscode);
                 }
          }
           catch(Exception e)
          {
        	  e.printStackTrace();
          }
	}
	}
}
         
	


