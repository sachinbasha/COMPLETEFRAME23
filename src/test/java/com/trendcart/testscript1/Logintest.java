package com.trendcart.testscript1;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.trendcart.genricUtils.FileUtils;
import com.trendcart.objectrepo.MyCart;
import com.trendcart.objectrepo.ShoppingPortalHomePage;
import com.trendcart.objectrepo.ShoppingPortalSignin;
import com.trendcart.genricUtils.*;
//@Listeners(com.trendcart.genricUtils.ListnerImplementation.class)
public class Logintest extends BaseClass{

	
	@Test
	public void test() throws IOException
	{
		/*FileUtils f=new FileUtils();
		 * 
		String url=f.readDataFromPropertyFile("url");
		String email=f.readDataFromPropertyFile("EmailAddress");
		String pwd=f.readDataFromPropertyFile("Password");
		WebDriver driver=new ChromeDriver();
		ShoppingPortalHomePage p=new ShoppingPortalHomePage(driver);
		ShoppingPortalSignin c=new ShoppingPortalSignin(driver);
		driver.get(url);
		p.getlogin();
		c.getEmailtextfield().sendKeys(email);
		c.getPwttextfield().sendKeys(pwd);
		c.getLogibutton().click();*/
		 MyCart m=new MyCart(driver);
		String actualtext = m.getWelcomlink().getText();
		String acceptedtext="Welcome -king";
		Assert.assertEquals(actualtext, acceptedtext);
		/*System.out.println(text);
		if(text.contains("Welcome -king"))
		{
			System.out.println("user home page is displayed 1");
		}
		else
			System.out.println("user home page is not displayed");*/
	}
}