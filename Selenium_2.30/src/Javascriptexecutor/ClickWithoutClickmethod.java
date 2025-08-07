package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickWithoutClickmethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	    WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    
	    js.executeScript("arguments[0].click()",searchBtn);
	}

}
