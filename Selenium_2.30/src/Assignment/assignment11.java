package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc@123");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
