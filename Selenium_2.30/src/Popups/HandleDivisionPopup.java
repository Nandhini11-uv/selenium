package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDivisionPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/");
		
	//	driver.manage().window().fullscreen(); SOMETIMES SOME ICONS WILL NOT VISIBLE.AT THAT TIME WE CAN USE FULLSCREEN TO VIEW ALL.
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	}

}
