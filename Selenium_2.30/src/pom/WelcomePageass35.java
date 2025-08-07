package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageass35 {
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	public WelcomePageass35(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	

}
