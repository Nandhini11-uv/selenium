package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.manage().window().setSize(new Dimension(500,400));
		
		String windowid = driver.getWindowHandle();
		
		System.out.println(windowid);
		
		driver.quit();
	}

}
