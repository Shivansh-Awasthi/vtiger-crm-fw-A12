package oppourtunities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class newOppourtunitiesExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//common data
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("bike");
		Row row = sheet.getRow(6);
		Cell data = row.getCell(1 + (int)(Math.random()*1000)); 
	    String name = data.getStringCellValue();
		
		
		
		//go to the Admin panel
				driver.get("http://localhost:8888/");
				
				//login to the panel
				
				WebElement username = driver.findElement(By.name("user_name"));
				username.sendKeys("admin");
				WebElement password = driver.findElement(By.name("user_password"));
				password.sendKeys("manager");
				
				driver.findElement(By.id("submitButton")).click();
				
				
				
				//go to opportunities
				
				driver.findElement(By.linkText("Opportunities")).click();
				
				driver.findElement(By.cssSelector("img[src = 'themes/softed/images/btnL3Add.gif']")).click();
				
				
				//fill the data
				
				
//				String name = "noooooo";
				driver.findElement(By.cssSelector("input[name = 'potentialname']")).sendKeys(name);
				
				
				
				WebElement RelType = driver.findElement(By.id("related_to_type"));
				Select selRelated = new Select(RelType);
				selRelated.selectByValue("Contacts");
				
				
				String PID= driver.getWindowHandle();
				driver.findElement(By.xpath("//input[@id = 'related_to_display']/../img")).click();
				
				Set<String>ids=  driver.getWindowHandles();
				Thread.sleep(2000);
				for(String i: ids) {
					Thread.sleep(1000);
					driver.switchTo().window(i);
				
					if(!i.equals(PID)) {
					Thread.sleep(2000);
					driver.findElement(By.partialLinkText("Patricia Johnson")).click();
					break;
					}
					
					
				}
				Thread.sleep(2000);
				driver.switchTo().window(PID);
				
				
				WebElement type = driver.findElement(By.name("opportunity_type"));
				Select selType = new Select(type);
				selType.selectByValue("New Business");
				
				WebElement lead = driver.findElement(By.name("leadsource"));
				Select selLead = new Select(lead);
				selLead.selectByValue("Partner");
				
				driver.findElement(By.cssSelector("input[value ='T']")).click();
				
				driver.findElement(By.name("amount")).sendKeys("999999");
				
				
				driver.findElement(By.name("probability")).sendKeys("0");
				
				
				driver.findElement(By.name("description")).sendKeys("Entering the sample Description.............");
				driver.findElement(By.cssSelector("input[accesskey = 'S']")).click();

				
				
				//validation
				
				String validation =  driver.findElement(By.id("dtlview_Opportunity Name")).getText();
				if(validation.contains(name)) {
					System.out.println("Success...");
				}
				else {
					System.out.println("Failed...");
				}

				//signout
				
				WebElement icon=  driver.findElement(By.cssSelector("img[src = 'themes/softed/images/user.PNG']"));
				Actions act= new Actions(driver);
				
				act.moveToElement(icon).build().perform();
				
				
				driver.findElement(By.linkText("Sign Out")).click();
				
				
				
				Thread.sleep(4000);
				driver.quit();
				
				
				
	}

}
