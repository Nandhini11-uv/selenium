package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderass41 {
	
//	@DataProvider
//	public String[][] dataSender() {
//		String[][] data= {{"virat","kohli","virat18@gmail.com","virat@18","virat@18"}};
//		return data;
//	}
	
	@Test(dataProviderClass = dataStorageass41.class,dataProvider = "dataSender1")
	public void register(String[] cred) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
		driver.findElement(By.id("LastName")).sendKeys(cred[1]);
		driver.findElement(By.id("Email")).sendKeys(cred[2]);
		driver.findElement(By.id("Password")).sendKeys(cred[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
		
		
	}
	

}
