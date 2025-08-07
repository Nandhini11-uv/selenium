package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment21 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
		WebElement allensolly = driver.findElement(By.xpath("//span[text()='ALLEN SOLLY']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)", allensolly);
		
		List<WebElement> allImgs = driver.findElements(By.tagName("img"));
		
		System.out.println(allImgs.size());
		
		driver.findElement(By.xpath("//img[@alt='Boys  Collar Casual tShirt']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("666666");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Check")).click();
		
		
	}

}
