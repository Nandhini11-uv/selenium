package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		
	
		driver.switchTo().alert().accept();
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
//		driver.switchTo().alert().dismiss();
	}

}
