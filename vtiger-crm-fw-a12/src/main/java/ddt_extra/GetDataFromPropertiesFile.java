package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./src/main/resources/CommonData.properties");
		
		Properties pObj = new Properties();
		
		pObj.load(fis);
		
		
		String browser = pObj.getProperty("browser");
		String url =  pObj.getProperty("url");
		String username =  pObj.getProperty("ussername");
		String password =  pObj.getProperty("password");
	
		System.out.println(browser);	
		System.out.println(url);	
		System.out.println(username);	
		System.out.println(password);	
		
		
		Thread.sleep(2000);
		driver.quit();
	

	}

}
