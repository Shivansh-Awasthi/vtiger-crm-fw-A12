package ddt_extra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class setDataFromExcel {

	
	
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");
		
		
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("bike");
		
		
		Row row =sheet.createRow(31);
		
		Cell cell =row.createCell(2);
		
		
		cell.setCellValue("Hello");
		
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/testScriptData.xlsx");
		
		wb.write(fos);
		
		
		fos.close();

        
        System.out.print(sheet.getRow(31).getCell(2).getStringCellValue());
        
        wb.close();
		
	}
}