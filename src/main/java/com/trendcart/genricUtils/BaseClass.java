package com.trendcart.genricUtils;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.trendcart.objectrepo.ShoppingPortalHomePage;
import com.trendcart.objectrepo.ShoppingPortalSignin;

public class BaseClass 
{
	public DatabaseUtils u=new DatabaseUtils();
	public ExcelUtils e=new ExcelUtils();
	public FileUtils f=new FileUtils();
	public WebDriverUtils w=new WebDriverUtils ();
	public   WebDriver driver;
	public  static  WebDriver sdriver;
	@BeforeSuite
	public void confug_beforsuit() throws SQLException
	{
		Reporter.log("data base connected",true);
		u.connectDb();
	}
	@BeforeClass
	public void confug_BC() throws IOException
	{
		
	        driver=new ChromeDriver();
	        Reporter.log("open browser",true);
	        driver.get(f.readDataFromPropertyFile("url"));
	        sdriver = driver;
	        w.maximizeWindow(driver);
	        w.implicitWait(driver);
	}
	
	@BeforeMethod
	public void confug_BM() throws IOException
	{
		Reporter.log("Before method",true);
		ShoppingPortalHomePage p=new ShoppingPortalHomePage(driver);
		p.getlogin();
		ShoppingPortalSignin s=new ShoppingPortalSignin(driver);
		s.getEmailtextfield().sendKeys(f.readDataFromPropertyFile("EmailAddress"));
		s.getPwttextfield().sendKeys(f.readDataFromPropertyFile("Password"));
		s.getLogibutton().click();
	}

	@AfterMethod
	public void confug_AM()
	{
		Reporter.log("logout",true);
	}
	@AfterClass
	public void confug_AC()
	{
		Reporter.log("browser is closed",true);
		driver.quit();
	}
	@AfterSuite
	public void confug_AS() throws SQLException
	{
		Reporter.log("database is closed",true);
		u.disconnectDB();
	}
	
}
