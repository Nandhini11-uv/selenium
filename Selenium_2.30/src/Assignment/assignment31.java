package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class assignment31 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("")
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String timestamp = LocalDateTime.now().toString().replace(":","-" );
		
		driver.get("https://www.dell.com/en-in");
		
	    WebElement infra = driver.findElement(By.xpath("//span[text()='IT Infrastructure']"));
	    
	    Actions act=new Actions(driver);
	    
	    act.moveToElement(infra).perform();
	    
	    WebElement industry = driver.findElement(By.xpath("//button[text()='Industry']"));
	    
	    act.moveToElement(industry).perform();
	    
	    
	    
	    driver.findElement(By.xpath("//a[text()='Manufacturing']")).click();
	    
	 
	    driver.findElement(By.xpath("//button[@class='email-close-btn']")).click();
	    
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File("./screenshots/"+timestamp+"ass-31.png");
	    
	    FileHandler.copy(temp, dest);
	    
	   WebElement find = driver.findElement(By.partialLinkText("Find a Store"));
	    
	  act .moveToElement(find).perform();
	  
	  act.click(find).perform();
	  
	  driver.findElement(By.xpath("//a[text()='Service Centre ']")).click();
	  
	  Set<String> allWindows = driver.getWindowHandles();
	  
	  for(String id:allWindows) {
		  driver.switchTo().window(id);
		  
		  String actUrl = driver.getCurrentUrl();
		  if(actUrl.contains("Service Centre")) {
			  break;
		  }
	  }
	  boolean submitBtn = driver.findElement(By.id("submit-btn")).isEnabled();
	  System.out.println(submitBtn);
		
	}

}
