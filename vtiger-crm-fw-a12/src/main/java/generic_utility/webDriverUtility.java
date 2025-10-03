package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class webDriverUtility {
	
	public String getDataFromExcel(String sheetNo, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptData.xlsx");
			
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetNo);
			Row row = sheet.getRow(rowNo);
			Cell data = row.getCell(cellNo);
			String value = data.getStringCellValue();
			wb.close();
			return value;
			
		}

}
