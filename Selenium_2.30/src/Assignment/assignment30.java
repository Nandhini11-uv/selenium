package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assignment30 {
	public static void main(String[] args) throws IOException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\USER\\Downloads\\Resume. n (1).docx");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots"+timestamp+"ass-30.png");
		
		FileHandler.copy(temp, dest);
	}

}
