package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment14 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.clear();
		username.sendKeys("virat");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("virat@18");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		String text = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		System.out.println(text);
		
	}

}
