package organization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//go to the Admin panel
		driver.get("http://localhost:8888/");
		
		//login to the panel
		
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("manager");
		
		driver.findElement(By.id("submitButton")).click();
		
		
		
		//go to organizations
		driver.findElement(By.linkText("Organizations")).click();
		
		
		driver.findElement(By.cssSelector("img[alt ='Create Organization...']")).click();
		
		
		//filling the data
		String name = "Automation In";
		WebElement OrgName = driver.findElement(By.name("accountname"));
		OrgName.sendKeys(name);
		
		driver.findElement(By.name("website")).sendKeys("www.samplesite.com");
		
		driver.findElement(By.name("employees")).sendKeys("23");
		
		driver.findElement(By.name("website")).sendKeys("www.samplesite.com");
		
		WebElement industry = driver.findElement(By.name("industry"));
		Select selIndustry = new Select(industry);
		selIndustry.selectByValue("Engineering");
		
		
		WebElement type = driver.findElement(By.name("accounttype"));
		Select selType = new Select(type);
		selType.selectByVisibleText("Partner");
		
		driver.findElement(By.id("phone")).sendKeys("9027898989");
		
		
		driver.findElement(By.name("email1")).sendKeys("shivansh@gmail.com");
		
		WebElement rating = driver.findElement(By.name("rating"));
		Select selRate = new Select(rating);
		selRate.selectByValue("Active");
		
		
		driver.findElement(By.name("annual_revenue")).sendKeys("9999999");
		
		driver.findElement(By.cssSelector("input[title= 'Save [Alt+S]']")).click();
		
		//verification
		
		String validateOrgName = driver.findElement(By.id("dtlview_Organization Name")).getText();
		
		if(validateOrgName.equals(name)) {
			System.out.println("Org Successfully created");
		}
		else {
			System.out.println("Failed...");
		}
		
		
		
		//signout
		
		WebElement icon=  driver.findElement(By.cssSelector("img[src = 'themes/softed/images/user.PNG']"));
		Actions act= new Actions(driver);
		
		act.moveToElement(icon).build().perform();
		
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
