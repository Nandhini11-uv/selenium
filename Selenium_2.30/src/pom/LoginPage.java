package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//DECLARATION
	@FindBy(id = "Email" )
	private WebElement emailTf;
	
	@FindBy(id = "Password")
	private WebElement passwordTf;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}
	//getters
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
   

}
