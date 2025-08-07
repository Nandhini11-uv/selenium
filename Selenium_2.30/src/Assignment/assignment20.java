package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assignment20 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		
		WebElement help = driver.findElement(By.linkText("Help & Support"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",help);
		
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/dream11.png");
		
		FileHandler.copy(temp, dest);
		
		js.executeScript("arguments[0].click()", help);
		
		Thread.sleep(4000);
		
		Set<String> searchBtn = driver.getWindowHandles();
		
		for(String id:searchBtn) {
			
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://get.dream11.help/hc/en-us")) {
				break;
			}
			
		}
		
		String color = driver.findElement(By.xpath("//input[@value='Search']")).getCssValue("background-color");
		
		System.out.println(color);
		
		Rectangle rect = driver.findElement(By.xpath("(//input[@value='Search'])[2]")).getRect();
		
		System.out.println(rect.getHeight());
		
		System.out.println(rect.getWidth());
		
		System.out.println(rect.getX());
		
		System.out.println(rect.getY());
		
		WebElement searchTF = driver.findElement(By.xpath("(//input[@id='query'])[3]"));
		
		js.executeScript("arguments[0].value='mobiles'",searchTF);
		
		WebElement search = driver.findElement(By.xpath("(//input[@value='Search'])[2]"));
		
		js.executeScript("arguments[0].click()",search);
		
		File tempr = ts.getScreenshotAs(OutputType.FILE); 
		
		File destin=new File("./screenshots"+timestamp+"assignment20-2.png");
		
		FileHandler.copy(tempr, destin);
		
	}

}
