package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class READDATAFROMEXCEL{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\practiceexcel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("practicesheet");
	int count=sh.getLastRowNum();
    System.out.println(count);
	
	for(int i=0;i<=count;i++)
	{
		int lastcell = sh.getRow(i).getLastCellNum();
		for(int j=0;j<lastcell;j++)
		{
		  String a = sh.getRow(i).getCell(j).getStringCellValue();
		  System.out.print(a+"||");
		 
		  }
		System.out.println();
	}
	
	
	

	}

}
