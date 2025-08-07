package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnStale {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		DemoWebShopWelcomePage wp=new DemoWebShopWelcomePage(driver);
		wp.getSearchTF().sendKeys("mobiles",Keys.ENTER);
		wp.getSearchTF().sendKeys("shoes");
		
//		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
//		searchTF.sendKeys("mobiles",Keys.ENTER);
//		searchTF.sendKeys("shoes");
		
//		WebElement search = driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("mobiles",Keys.ENTER);
	}

}
