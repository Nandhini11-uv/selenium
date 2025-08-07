package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//opening myntra app in maximized mode...
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(20000);
		
		
		//to verify the welcome page is displayed or not...
		String url = driver.getCurrentUrl();
		
		//printing the url....
		System.out.println(url);
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size);
		
		//to close the window using quit...
		driver.quit();
	}
	

}
