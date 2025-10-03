package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic_utility.webDriverUtility;






//class getDataExcel{
//	public String getDataFromExcel(String sheetNo, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
//		
//	FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");
//		
//		
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet(sheetNo);
//		Row row = sheet.getRow(rowNo);
//		Cell data = row.getCell(cellNo);
//		String value = data.getStringCellValue();
//		wb.close();
//		return value;
//		
//	}
//}

public class getDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		
//		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");
//		
//		
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("bike");
//		Row row = sheet.getRow(8);
//		Cell data = row.getCell(0);
//		String value = data.getStringCellValue();
		
		
		webDriverUtility gdfe = new webDriverUtility();
		
		
		String value = gdfe.getDataFromExcel("bike", 8, 0);
		
		System.out.println(value);
		
		
		
		Thread.sleep(1000);
		

		

	}

}
