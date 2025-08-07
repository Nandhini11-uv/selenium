package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			Thread.sleep(1000);
			if(driver.getCurrentUrl().contains("flipkart"))
			{
				System.out.println(driver.manage().window().getSize());
			}
			else if(driver.getCurrentUrl().contains("ebay"))
			{
				System.out.println(driver.manage().window().getPosition());
			}
		}
		driver.quit();
	}

}
