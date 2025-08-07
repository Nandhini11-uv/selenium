package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.demowebshopHomePage;
import pom.demowebshopLoginPage;
import pom.welcomepagedemowebShop;

public class BaseClassDemowebshop {
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String emailTF = prop.getProperty("emailTF");
		String passwordTF = prop.getProperty("passwordTF");
		
		welcomepagedemowebShop wp=new welcomepagedemowebShop(driver);
		wp.getLoginLink().click();
		
		demowebshopLoginPage lp=new demowebshopLoginPage(driver);
		lp.getEmailTF().sendKeys(emailTF);
		lp.getPasswordTF().sendKeys(passwordTF);
		lp.getLoginBtn().click();
	}
	@AfterMethod
	public void logout() {
		 demowebshopHomePage hp=new demowebshopHomePage(driver);
		 hp.getLogoutLink().click();
	}
	@AfterClass
     public void closeBrowser() {
		driver.quit();
	}
}
