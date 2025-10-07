package generic_utility;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class WebDriverUtility {

	
	
	WebDriver driver;
	Actions act;
	
	
	
	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
		this.act = new Actions(driver);
	}
	
	
    public void winMax() {
        driver.manage().window().maximize();
    }

    public void winClose() {
        driver.close();
    }

    public void winQuit() {
        driver.quit();
    }

    public Point getPosition() {
        return driver.manage().window().getPosition();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void back() {
        driver.navigate().back();
    }

    public void forward() {
        driver.navigate().forward();
    }
    public void implicitWait(long seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    
	
}
