package com.demo.testscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.trendcart.genricUtils.IpathConstants;

public class readmultipledatafromexcel {

	@DataProvider
	public Object[][] data() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis =new FileInputStream(IpathConstants.Excelpath);
	    Workbook wb =WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("shippingaddress");
	   int lastrow = sh.getLastRowNum();
	    int lastcell=sh.getRow(0).getLastCellNum();
	    Object[][]obj=new Object[lastrow+1][lastcell];
	    for(int i=0;i<=lastrow;i++)
	    {
	    	for(int j=0;j<lastcell;j++)
		    {
		    	obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		    }
	    }
	    return obj;
	    
	   /* for(int i=0;i<=lastrow;i++)
	    {
	    	for(int j=0;j<lastcell;j++)
		    {
		    	System.out.print(obj[i][j]+"      ");
		    }
	    	System.out.println();
	    }
	   */
		 
		
	}

}
