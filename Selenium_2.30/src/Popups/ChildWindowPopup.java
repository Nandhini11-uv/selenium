package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/30");
		
		driver.findElement(By.id("compare")).click();
		
		childwindow();
		
//		Set<String> allWindowIds = driver.getWindowHandles();
//		
//		for(String id:allWindowIds) {
//			driver.switchTo().window(id);
//			
//			String acturl = driver.getCurrentUrl();
//			if(acturl.contains("ebay")) {
//				break;
//			}
//		}
//		driver.manage().window().maximize();
//		
//		
	}
	public static void childwindow() {
		
    	WebDriver driver=new ChromeDriver();
		
       Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			
			String acturl = driver.getCurrentUrl();
			if(acturl.contains("ebay")) {
				break;
			}
		}
		driver.manage().window().maximize();
		
		
	}
		
	}


