package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		
		String singleid = driver.getWindowHandle();
		
		System.out.println(singleid);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		//System.out.println(allWindowIds);//PRINTING ALL WINDOW IDS AS SET[......]
		
		//to get the window ids one by one,we use for each loop....
		
		for(String id:allWindowIds) {// for each loop...
			System.out.println(id);
		}
	}

}
