package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class getDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");
		
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("bike");
		Row row = sheet.getRow(8);
		Cell data = row.getCell(0);
		
		
		System.out.println(data);
		
		
		
		Thread.sleep(1000);
		
		wb.close();
		

	}

}
