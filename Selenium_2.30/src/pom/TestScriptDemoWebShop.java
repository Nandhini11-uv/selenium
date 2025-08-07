package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage  wp=new WelcomePage(driver);
	//	wp.getLoginLink().click();
	//	wp.getRegisterLink().click();
		
//		LoginPage lp=new LoginPage(driver);
//		lp.getEmailTf().sendKeys("nandhu13@gmail.com");
//		
//		lp.getPasswordTf().sendKeys("nandhu@123");
//		
//		lp.getLoginBtn().click();
//		
//		Thread.sleep(2000);
		wp.getAddToCartBtn().get(2).click();
	}

}
