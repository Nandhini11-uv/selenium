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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class assignment27 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Right Click")).click();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Right Click']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(element).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		Thread.sleep(2000);
		
		WebElement msg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		
		System.out.println(msg.getText());
		
		driver.findElement(By.linkText("Double Click")).click();
		
		WebElement doubleClickElementNo = driver.findElement(By.xpath("//button[text()='No']"));
		
		Actions act1=new Actions(driver);
		
		act1.doubleClick(doubleClickElementNo).perform();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/"+timestamp+"ass-27.png");
		
		FileHandler.copy(temp, dest);
		
	}

}
