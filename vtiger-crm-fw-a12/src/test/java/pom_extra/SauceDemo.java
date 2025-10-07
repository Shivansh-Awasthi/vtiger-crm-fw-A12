package pom_extra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		
	
				
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        login_page lp = new login_page(driver);
        
        driver.get("https://www.saucedemo.com/v1/");
        
        
        WebElement un =lp.getUn();
        WebElement pwd =lp.getPwd();
        WebElement login =lp.getLogin();
        
//        WebElement un = driver.findElement(By.id("user-name"));
//        WebElement pwd =   driver.findElement(By.id("password"));
//        WebElement login =   driver.findElement(By.id("login-button"));
        
        
        
        driver.navigate().refresh();
        
        un.sendKeys("standard_user");
        
        pwd.sendKeys("secret_sauce");
        
        
        login.click();
        
        Thread.sleep(2000);
        
        
        
//        WebElement verifier = driver.findElement(By.id("page_wrapper"));
        HomePage hp = new HomePage(driver);
        
        WebElement verifier = hp.getVerifier();
        WebElement addToCart = hp.getAddToCart();
        WebElement shoppingCart = hp.getShoppingCart();
        
        
        if(verifier.isDisplayed()) {
        	System.out.println("Success...");
        }
        else {
        	System.out.println("Failed");
        }
        
        
//        WebElement addToCart = driver.findElement(By.xpath("//div[text()= 'Sauce Labs Backpack']/../../..//button"));
        
      
        
//        WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));

        
        addToCart.click();
        
        Thread.sleep(1000);
        
        shoppingCart.click();
        
        
        
        //cartPage 
        
        cartPage cp = new cartPage(driver);
        
        WebElement checkOut1= cp.getCheckOut1();
        
//       WebElement checkOut1= driver.findElement(By.linkText("CHECKOUT"));
        
        checkOut1.click();
        
        
        
        //cart page 1
        
//        WebElement fn=  driver.findElement(By.id("first-name"));
//        WebElement ln=   driver.findElement(By.id("last-name"));
//        WebElement code=   driver.findElement(By.id("postal-code"));
//        WebElement proceed = driver.findElement(By.className("btn_primary"));
//        
        CheckOutOne co = new CheckOutOne(driver);
        
        WebElement fn=  co.getFn();
        WebElement ln=   co.getLn();
        WebElement code=   co.getCode();
        WebElement proceed = co.getProceed();
        
        
        fn.sendKeys("SHivansh");
        ln.sendKeys("Awasthi");
        code.sendKeys("123445");
        proceed.click();
        
        
        
        
        //cart page 2
        
//        WebElement finish= driver.findElement(By.linkText("FINISH"));
        CheckOutTwo co2 = new CheckOutTwo(driver);
        
        WebElement finish= co2.getFinish();
        
        finish.click();
        
        Thread.sleep(3000);
        driver.quit();

	}

}
