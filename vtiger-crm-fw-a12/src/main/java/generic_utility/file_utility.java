package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class file_utility {
	
	public String GetDataFromProperties(String key) throws IOException, InterruptedException {
	 	
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);
		
		
		String value = pObj.getProperty(key);

		return value;
		
		}
	
	

		
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


};


