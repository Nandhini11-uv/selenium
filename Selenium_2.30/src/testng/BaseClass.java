package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver; //DECLARATION LIKE int a;
							 //if we use WebDriver here it becomes local variable,so we can't use outside the method.
							 //so we are using WebDriver as global variable,so that we can use anywhere in the class.
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver(); //INITIALIZING LIKE demo d=new demo() 
								  //if we use WebDriver here it becomes local variable,so we can't use outside the method.
								  //so we are using WebDriver as global variable,so that we can use anywhere in the class.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
