package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		Thread.sleep(1000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to verify login page is displayed or not we use getCurrentUrl or getTitle.......
		
		if(url.equals("https://demowebshop.tricentis.com/login"))
		{
			System.out.println("Login page is displayed");
		}
		else
		{
			System.out.println("Login page is not displayed");
		}
		
		driver.findElement(By.cssSelector("input[class='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.className("password")).sendKeys("1234");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	} 
	

}
