package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writedataintopropertyfile {

	public static void main(String[] args) throws IOException {
		
		//create object for properties class
		
		Properties p=new Properties();
		p.setProperty("browser", "chrome");
		p.setProperty("url", "http://rmgtestingserver/domain/Online_Shopping_Application/");
		p.setProperty("username", "admin");
		p.setProperty("password", "admin");
		
		//create object of file out put stream
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Commandata.properties");
		p.store(fos, "write Data");
		
		//reading data from properties file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Commandata.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String pwd = p.getProperty("password");
		System.out.println(pwd);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);


	}

}
