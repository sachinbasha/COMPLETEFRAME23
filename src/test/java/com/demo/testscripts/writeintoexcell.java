package com.demo.testscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeintoexcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testscript.xlsx");
		Random r=new Random();
		int value = r.nextInt();
		Workbook wb = WorkbookFactory.create(fis);
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<10;j++)
			{
		       wb.getSheet("Sheet1").getRow(i).createCell(j).setCellValue("sachin"+value);
		
			}
			
		}
	    FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\testscript.xlsx");
	    wb.write(fos);

	}

}
