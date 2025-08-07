package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//span[text()='Train tickets']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Live train status']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Show Availability')][1]")).click();
		//driver.findElement(By.className("train-container-wrapper"))
	}

}
