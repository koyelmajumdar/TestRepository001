package com.qa.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataProviderClass {
	
//	public static void main(String args[]) throws EncryptedDocumentException, IOException {
	public Object[][] dataProviderMethod() throws EncryptedDocumentException, IOException {
		
		Object[][] objarr = new Object[1][1];
	
		FileInputStream fs = new FileInputStream("C:\\Users\\Home\\Desktop\\TestDataSheet.xlsx");
		Workbook wbf = WorkbookFactory.create(fs);
		Sheet ws = wbf.getSheet("Sheet1");
		
		objarr[0][0]= ws.getRow(1).getCell(1).getStringCellValue().toString();
		
		return  objarr;
		
	//	System.out.println(objarr[0][0]);
	//}
	
}	

}
