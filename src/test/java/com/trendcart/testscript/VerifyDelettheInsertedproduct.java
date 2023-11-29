package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDelettheInsertedproduct {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream (".\\src\\test\\resources\\commandataAdmin.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username=p.getProperty("username");
		String pwd=p.getProperty("Password");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		FileInputStream fi=new FileInputStream (".\\src\\test\\resources\\testscript.xlsx");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
		driver.findElement(By.name("category")).click();
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet = wb.getSheet("category");
		int lastrow = sheet.getLastRowNum();
		String CategoryName = sheet.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.name("category")).sendKeys(CategoryName);
		String description = sheet.getRow(1).getCell(2).getStringCellValue();
	    driver.findElement(By.name("description")).sendKeys(description);
	    driver.findElement(By.xpath("//button[text()='Create']")).click();
	    driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();
	    WebElement selectbox = driver.findElement(By.xpath("//select[@name='category']"));
	    Select s=new Select(selectbox);
	    String dropdowndata = sheet.getRow(1).getCell(2).getStringCellValue();
	    s.selectByVisibleText(dropdowndata);
	    String SubCategoryName = sheet.getRow(1).getCell(3).getStringCellValue();
	    driver.findElement(By.xpath("//input[@name='subcategory']")).sendKeys(SubCategoryName);
	    driver.findElement(By.xpath("//button[@name='submit']")).click();
	    driver.findElement(By.xpath("//a[text()='Insert Product ']")).click();
	    WebElement sltbox = driver.findElement(By.name("category"));
	    Select a=new Select(sltbox);
	    String selectcategory = sheet.getRow(1).getCell(4).getStringCellValue();
	    a.selectByVisibleText(selectcategory);
	    WebElement sltsubcategory = driver.findElement(By.name("subcategory"));
	    Select b=new Select(sltsubcategory);
	    String subdata = sheet.getRow(1).getCell(5).getStringCellValue();
	    b.selectByVisibleText(subdata);
	    String productname = sheet.getRow(1).getCell(6).getStringCellValue();
	   driver.findElement(By.name("productName")).sendKeys(productname);
	   String productcompany = sheet.getRow(1).getCell(7).getStringCellValue();
	   driver.findElement(By.name("productCompany")).sendKeys(productcompany);
	   String ProductPriceBeforeDiscounn = sheet.getRow(1).getCell(8).getStringCellValue();
	   driver.findElement(By.name("productpricebd")).sendKeys(ProductPriceBeforeDiscounn);
	   String ProductPriceAfterDiscount=sheet.getRow(1).getCell(9).getStringCellValue();
	   driver.findElement(By.name("productprice")).sendKeys(ProductPriceAfterDiscount);
	   String ProductDescription = sheet.getRow(1).getCell(10).getStringCellValue();
	   driver.findElement(By.name("productDescription")).sendKeys(ProductDescription);
	   String ProductShippingCharge = sheet.getRow(1).getCell(11).getStringCellValue();
	   driver.findElement(By.name("productShippingcharge")).sendKeys(ProductShippingCharge);
	   String productavailabilityDropdown=sheet.getRow(1).getCell(12).getStringCellValue();
	   WebElement seltbxproductavailability = driver.findElement(By.name("productAvailability"));
	   Select c=new  Select(seltbxproductavailability);
	   c.selectByVisibleText(productavailabilityDropdown);
	   

		
			  
		
	}
		
		
		
		

	}


