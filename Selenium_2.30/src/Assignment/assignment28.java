package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class assignment28 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(img1, trash).perform();
		
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		act.dragAndDrop(img2, trash).perform();
		
		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		
	     driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
	     
	     Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
    	 driver.navigate().forward();
    	 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.linkText("SQL Cheat Sheet")).click();
		 
		 Set<String> allwindows = driver.getWindowHandles();
		 
		 for(String id:allwindows) {
			 driver.switchTo().window(id);
			 if(driver.getCurrentUrl().equals("https://www.globalsqa.com/sql-cheat-sheet/")) {
				 
				 WebElement sqljoins = driver.findElement(By.xpath("//img[@loading='lazy']"));
				 
				 JavascriptExecutor js=(JavascriptExecutor) driver;
				 
				 js.executeScript("arguments[0].scrollIntoView(true)", sqljoins);
			 }
		 }
		 
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("./screenshots/"+timestamp+"ass-28.png");
		 
		 FileHandler.copy(temp, dest);
	}

}
