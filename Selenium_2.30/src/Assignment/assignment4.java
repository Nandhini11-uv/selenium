package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.myntra.com/");
		
		driver.manage().window().setPosition(new Point(350,300));
		
		driver.manage().window().setSize(new Dimension(500, 400));
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
