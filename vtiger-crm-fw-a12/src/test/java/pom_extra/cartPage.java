package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {

	
	
	
	public  cartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText = "CHECKOUT")
	private WebElement checkOut1;
	
	
	
	public WebElement getCheckOut1() {
		return checkOut1;
	}
	
}
