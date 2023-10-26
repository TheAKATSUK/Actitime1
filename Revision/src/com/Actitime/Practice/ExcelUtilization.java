package com.Actitime.Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ExcelUtilization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataDrivenTesting d=new DataDrivenTesting();
		String data = d.readDataFromExcel("Sheet1",4, 1);
		System.out.println(data);
	}

}
