package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAss36 {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTF;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement loginBtn;
	
	public LoginPageAss36(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
