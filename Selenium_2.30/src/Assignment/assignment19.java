package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assignment19 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots"+timestamp+".png");
		
		FileHandler.copy(temp, dest);
	}

}
