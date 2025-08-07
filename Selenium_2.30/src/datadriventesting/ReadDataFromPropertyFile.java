package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		// STEP 1: CREATE FILEINPUTSTREAM OBJECT
		
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		
		// STEP 2: CREATE RESPECTIVE FILE TYPE OBJECT
		
		Properties prop=new Properties();
		
		// STEP 3: CALL READ METHODS
		
		prop.load(fis);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
        String email = prop.getProperty("email");
		System.out.println(email);
        
        String password = prop.getProperty("password");
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		

	}

}
