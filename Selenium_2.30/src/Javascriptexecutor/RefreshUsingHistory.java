package Javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshUsingHistory {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go()");
	}

}
