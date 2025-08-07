package Javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		
		WebElement howto = driver.findElement(By.xpath("//div[text()='How to ']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
    	js.executeScript("arguments[0].scrollIntoView(true)",howto );
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(false)", howto);
		
		
	}

}
