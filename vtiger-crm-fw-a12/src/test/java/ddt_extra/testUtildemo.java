package ddt_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_utility.WebDriverUtility; 

public class testUtildemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverUtility util = new WebDriverUtility(driver);
		
		
		util.openUrl("https://facebook.com/");
		util.winMax();
		util.implicitWait(15);
		Thread.sleep(3000);
		util.winQuit();
	}

}
