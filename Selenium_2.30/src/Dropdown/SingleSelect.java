package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/USER/OneDrive/Desktop/Month.html");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select monSel=new Select(month);
		
		monSel.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("Year"));
		
		Select yearSel=new Select(year);
		
	//	yearSel.selectByIndex(1);
		
	//	yearSel.selectByValue("3");
		
		yearSel.selectByVisibleText("2022");
	}

}
