package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class assignment23 {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://x.com/");
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select monSel=new Select(month);
		monSel.selectByValue("8");
		
	    WebElement day = driver.findElement(By.id("SELECTOR_2"));
	    Select daySel=new Select(day);
	    daySel.selectByIndex(15);
	    
	    WebElement year = driver.findElement(By.id("SELECTOR_3"));
	    Select yearSel=new Select(year);
	    yearSel.selectByVisibleText("1947");
	    
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File("./screenshots/"+timestamp+"ass-23.png");
	    
	    FileHandler.copy(temp, dest);
		
		
	}

}
