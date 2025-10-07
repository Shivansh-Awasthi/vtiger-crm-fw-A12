package pom_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	
	
	//initialization
public login_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}



 @FindBy(id = "user-name")
 WebElement un;
 
 
 
 @FindBy(id = "password")
 private WebElement pwd;
 
 @FindBy(id = "login-button")
 private WebElement login;

 public WebElement getUn() {
	 return un;
 }
 
 public WebElement getPwd() {
	 return pwd;
 }
 public WebElement getLogin() {
	 return login;
 }
	
}
