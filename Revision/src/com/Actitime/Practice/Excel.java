package com.Actitime.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		FileInputStream fis=new FileInputStream("./TestData/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(5).getCell(1).setCellValue("Leela");
		FileOutputStream fos=new FileOutputStream("./TestData/Testdata.xlsx");
		wb.write(fos);
		
	}

}
