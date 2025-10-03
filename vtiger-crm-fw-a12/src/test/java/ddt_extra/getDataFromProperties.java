package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.file_utility;






// class getDataFromProps{
//	
//	
//	public String GetDataFromProperties(String key) throws IOException, InterruptedException {
//		 	
//	FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
//	
//	Properties pObj = new Properties();
//	pObj.load(fis);
//	
//	
//	String value = pObj.getProperty(key);
//
//	return value;
//	
//	}
//	
//}

public class getDataFromProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		
//		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
//		
//		Properties pObj = new Properties();
//		pObj.load(fis);
//		
//		
//		String browser = pObj.getProperty("browser");
//		String url =  pObj.getProperty("url");
//		String username =  pObj.getProperty("ussername");
//		String password =  pObj.getProperty("password");
		
		file_utility gdfp = new file_utility();
		
		String browser = gdfp.GetDataFromProperties("browser");
		String url = gdfp.GetDataFromProperties("url");
		String username = gdfp.GetDataFromProperties("username");
		String password = gdfp.GetDataFromProperties("password");
	
		System.out.println(browser);	
		System.out.println(url);	
		System.out.println(username);	
		System.out.println(password);	
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
