package Javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillBottom {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight))");//SCROLL DOWN TILL LAST
		
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollTo(0,-document.body.scrollHeight))");//SCROLL UP TILL BEGINNING
		
		
	}

}
