package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToBreak {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();

		Set<String> allWindowIds = driver.getWindowHandles(); // Capturing ids...

		for (String id : allWindowIds) {
			driver.switchTo().window(id);// Switching to each windows..
			Thread.sleep(2000);
			if (driver.getCurrentUrl().equals("https://www.flipkart.com/")) {
				break;
			}

		}
		driver.manage().window().maximize();
	}

}
