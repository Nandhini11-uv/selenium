package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment22 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement laptop = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(false)",laptop );
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement sucessMsg = driver.findElement(By.linkText("shopping cart"));
		
		wait.until(ExpectedConditions.visibilityOf(sucessMsg));
		
		System.out.println(sucessMsg);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/ass-22.png");
		
		FileHandler.copy(temp, dest);
	}

}
