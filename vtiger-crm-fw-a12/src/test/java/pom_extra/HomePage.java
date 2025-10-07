package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id = "page_wrapper")
	private WebElement verifier;
	
	
	@FindBy(xpath = "//div[text()= 'Sauce Labs Backpack']/../../..//button")
	private WebElement addToCart;
	
	
	
	@FindBy(className = "shopping_cart_link")
	private WebElement shoppingCart;
	
	public WebElement getVerifier() {
		return verifier;
	}
	
	
	public WebElement getAddToCart() {
		return addToCart;
	}
	
	public WebElement getShoppingCart() {
		return shoppingCart;
	}
}
