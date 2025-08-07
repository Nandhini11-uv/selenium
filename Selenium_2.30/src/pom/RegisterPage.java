package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    @FindBy(id = "FirstName")
    private WebElement firstnameTf;
    
    @FindBy(id = "LastName")
    private WebElement lastnameTf;
    
    @FindBy(id = "Email")
    private WebElement emailTf;
    
    @FindBy(id = "Password")
    private WebElement passwordTf;
    
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmpasswordTf;
    
    public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTf() {
		return firstnameTf;
	}

	public WebElement getLastnameTf() {
		return lastnameTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getConfirmpasswordTf() {
		return confirmpasswordTf;
	}
    
    
}
