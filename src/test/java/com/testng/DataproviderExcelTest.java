package com.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trendcart.genricUtils.IpathConstants;

public class DataproviderExcelTest 
{
	@DataProvider
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream(IpathConstants.Excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("shippingaddress");
	int lastrow = sh.getLastRowNum();
    short lastcell = sh.getRow(0).getLastCellNum();
    Object[][]obj=new Object[lastrow][lastcell];
    for(int i=0;i<=lastrow;i++)
    {
    	Object c=sh.getRow(i).getCell(i).getStringCellValue();
    }
    return obj;
	
	}
	@Test(dataProvider="data")
	public void test(String data,String data1)
	{
	System.out.println(data+"----------"+data1);	
	}

}
