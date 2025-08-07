package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assignment32 {
	public static void main(String[] args) throws IOException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		FileInputStream fis=new FileInputStream("./TestData/ass-32.properties");
		
		Properties prop=new Properties();
		
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
        
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./screenshots"+timestamp+"ass-32.png");
        FileHandler.copy(temp, dest);
        
		
	}

}
