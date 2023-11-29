package com.trendcart.genricUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtils 
{
	/**
	 * this method is used to read the data from excel
	 * @author sachin
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromeExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstants.Excelpath);
		Workbook wb= WorkbookFactory.create(fis);
	    String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
	/**
	 * this method is used to write data into excel
	 * author sachin
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataToExcel(String sheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstants.Excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheetName).createRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos =new FileOutputStream(IpathConstants.Excelpath);
		wb.write(fos);
		wb.close();
	
	}
	/**
	 * this method is used to get total row count
	 * author sachin
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowCount(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstants.Excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int count=sh.getLastRowNum();
		return count;
		
	}
	public void readMultipleData(String sheetName,WebDriver driver) throws EncryptedDocumentException, IOException
	{
		JavaUtils jlib=new JavaUtils();
		HashMap<String, String> m=new HashMap<String, String>();
		FileInputStream fi=new FileInputStream(IpathConstants.Excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet shet = wb.getSheet(sheetName);
		int row = shet.getLastRowNum();
	    for(int i=0;i<=row;i++)
		{
		 String key = wb.getSheet(sheetName).getRow(i).getCell(0).getStringCellValue();
		 String value = wb.getSheet(sheetName).getRow(i).getCell(1).getStringCellValue();
		 m.put(key, value);
		}
		 for(Entry<String,String>set:m.entrySet())
		 {
		  driver.findElement(By.name(set.getKey())).clear();
		  driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		 }
		
		
	}

}
