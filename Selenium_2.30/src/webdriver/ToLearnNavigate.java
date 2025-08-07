package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		
		//Instead of get() method we can use to() method to navigate to that webpage...
		
		//driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		
		Thread.sleep(2000);
		driver.navigate().back(); //used to backward operation...
		
		Thread.sleep(2000);
		driver.navigate().forward(); //used to forward operation...
		
		Thread.sleep(2000);
		driver.navigate().refresh(); //used to refresh operation...
		
	}

}
