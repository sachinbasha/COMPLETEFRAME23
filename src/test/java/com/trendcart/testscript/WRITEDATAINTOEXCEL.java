package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WRITEDATAINTOEXCEL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\practiceexcel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("practicesheet");
		for(int i=0;i<=2;i++)
		{
		     for(int j=0;j<5;j++)
			 {
		        sh.createRow(i).createCell(j).setCellValue("qspiders");
		     }
		     System.out.println();
		}
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\practiceexcel.xlsx"); 
		wb.write(fos);
		wb.close();

	}

}
