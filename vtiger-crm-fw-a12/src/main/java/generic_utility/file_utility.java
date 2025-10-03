package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class file_utility {
	
	public String GetDataFromProperties(String key) throws IOException, InterruptedException {
	 	
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);
		
		
		String value = pObj.getProperty(key);

		return value;
		
		}

};
