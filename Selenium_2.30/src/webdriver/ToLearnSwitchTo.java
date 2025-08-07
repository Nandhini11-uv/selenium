package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles(); //CAPTURING ids
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			//To Close only amazon window only.......
			
//			if(driver.getCurrentUrl().equals("https://www.amazon.in/"))
//			{
//				driver.close();
//			}
//			if(driver.getCurrentUrl().contains("amazon"))
//			{
//				driver.close();
//			}
//			if(driver.getCurrentUrl().equals("https://www.flipkart.com/"))
//			{
//				driver.manage().window().maximize();
//			}
			if(driver.getCurrentUrl().contains("flipkart"))
			{
				driver.manage().window().maximize();
			}
			else if(driver.getCurrentUrl().contains("amazon"))
				{
					driver.close();
				}
//			
		}
	}

}
