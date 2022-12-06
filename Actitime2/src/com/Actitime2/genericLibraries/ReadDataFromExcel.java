package com.Actitime2.genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel extends BaseClass {
	
	public String ReadDataExcel(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {

	FileInputStream fis=new FileInputStream("./TestData/Testdata.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String value=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	
	}
}
