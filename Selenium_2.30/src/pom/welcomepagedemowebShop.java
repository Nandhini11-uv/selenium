package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepagedemowebShop { //DECLARATION

	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	public welcomepagedemowebShop(WebDriver driver) { //INITIALIZATION USING CONSTRUCTOR
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
}
