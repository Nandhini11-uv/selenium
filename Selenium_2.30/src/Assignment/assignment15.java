package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment15 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		String color = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("color");
		System.out.println(color);
		
		Rectangle rect = driver.findElement(By.xpath("//button[text()='Sign in']")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		driver.findElement(By.linkText("Vtiger")).click();
		
		Rectangle rects = driver.findElement(By.partialLinkText("GET A DEMO")).getRect();
		System.out.println(rects.getHeight());
		System.out.println(rects.getWidth());
		System.out.println(rects.getX());
		System.out.println(rects.getY());
		
	}

}
