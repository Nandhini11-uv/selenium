package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Nandhini");
		Thread.sleep(1000);
		
		driver.findElement(By.id("LastName")).sendKeys("Vadivel");
		Thread.sleep(1000);
		
		driver.findElement(By.name("Email")).sendKeys("nandhu@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("Password")).sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElement(By.id("register-button")).click();
		
	}

}
