package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//DECLARATION
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private List<WebElement> addToCartBtn;
	
	//INITIALIZATION
	public WelcomePage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	}
   
	//getters
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public List<WebElement> getAddToCartBtn() {
		return addToCartBtn;
	}
	
	
	
	
	
	
	

}
