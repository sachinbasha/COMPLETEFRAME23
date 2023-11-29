package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

   public static void main(String[] args) throws EncryptedDocumentException, IOException {
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testscript.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
   Sheet sh = wb.getSheet("LOGNFB");
   HashMap<String, String>m=new HashMap();
   for(int i=0;i<=sh.getLastRowNum();i++)
	{
	String key = sh.getRow(i).getCell(0).getStringCellValue();
	String value=sh.getRow(i).getCell(1).getStringCellValue();
	m.put(key, value);
	}
	for(Entry<String,String>set:m.entrySet())
	 {
	driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	 }
				   
  }

	}


