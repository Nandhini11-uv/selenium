package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demowebshopLoginPage {
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;
	
	public demowebshopLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
