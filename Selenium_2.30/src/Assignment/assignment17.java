package Assignment;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment17 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Facebook")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String ids:allwindow) {
			driver.switchTo().window(ids);
			if(driver.getCurrentUrl().equals("https://www.facebook.com/nopCommerce")) {
				String color = driver.findElement(By.xpath("//span[text()='Create new account']/../../../..")).getCssValue("background-color");
				System.out.println(color);
				}
			}
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String id:ids) {
			driver.switchTo().window(id);
			
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().equals("https://www.facebook.com/reg/?entry_point=logged_out_dialog&next=%2FnopCommerce")) 
			{
		
		       boolean signup = driver.findElement(By.xpath("//button[text()='Sign Up']")).isDisplayed();
		       System.out.println(signup);
		
		}}
	}
}
		
		//driver.findElement(By.xpath("")).isDisplayed();
		
		
		
		
		
		
	


