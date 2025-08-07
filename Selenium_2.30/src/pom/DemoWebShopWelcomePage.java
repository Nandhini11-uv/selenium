package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopWelcomePage {
	@FindBy(id = "small-searchterms")
	private WebElement searchTF;
	
	public DemoWebShopWelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTF() {
		return searchTF;
	}
    

}
