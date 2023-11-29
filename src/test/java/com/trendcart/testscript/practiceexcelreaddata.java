package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practiceexcelreaddata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\practiceexcel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("practicesheet");
	Row rowcount = sh.getRow(0);
	for(int i=0;i<=rowcount;i++)
	{
		for(int j=0;j<=sh.getRow(rowcount);j++)
		{
			wb.getSheet("practicesheet").getRow(i).getCell(j).getStringCellValue();
		}
	}
	
	
	

	}

}
