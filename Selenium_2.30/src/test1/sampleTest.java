package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sampleTest {
	
	@Test
	public void dream11() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		driver.findElement(By.xpath("(//div[contains(@class,'cursor-pointer')])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Fantasy Cricket']")).click();
		
		FileInputStream fis =new FileInputStream("./TestData/premockpropertyfile.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String mobno = prop.getProperty("mobileno");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys(mobno);
		
		driver.findElement(By.id("regUser")).click();
		
		String errorMsg = driver.findElement(By.id("errorMob")).getText();
		System.out.println(errorMsg);
		
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.linkText("About Us")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String id:allwindows) {
			driver.switchTo().window(id);
			
			if(driver.getCurrentUrl().contains("https://www.dreamsports.group/")) {
				break;
			}
		}
		driver.findElement(By.linkText("Newsroom")).click();
		
		WebElement brand = driver.findElement(By.id("changebrand"));
		
		Select sel=new Select(brand);
		sel.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("changedate"));
		
		Select sel1=new Select(year);
		sel1.selectByIndex(5);
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/premock.png");
		FileHandler.copy(temp, dest);
		
		
		
		
	}

}
