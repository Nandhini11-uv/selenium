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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class assignment26 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		driver.switchTo().frame(0);
		
//		WebElement map = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
//		
//		driver.switchTo().frame(map);
//		
		driver.findElement(By.id("region-27")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@class='button compact yellow']")).click();
		
		driver.findElement(By.id("user")).sendKeys("abcd@123");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.id("cpass")).sendKeys("123456789");
		driver.findElement(By.id("firstName")).sendKeys("puppy");
		driver.findElement(By.id("lastName")).sendKeys("charm");
		driver.findElement(By.id("phone")).sendKeys("9876543211");
		
		WebElement dropdown = driver.findElement(By.id("user-type"));
		
		Select user=new Select(dropdown);
		
		user.selectByVisibleText("Pet Owner");
		
		driver.findElement(By.xpath("//label[@for='accept-tou']/..//input[@id='accept-tou']")).click();
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+timestamp+"ass-26.png");
		FileHandler.copy(temp, dest);
		

	}

}
