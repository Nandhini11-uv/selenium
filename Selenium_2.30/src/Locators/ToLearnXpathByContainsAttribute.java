package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContainsAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("iphone");
	}

}
