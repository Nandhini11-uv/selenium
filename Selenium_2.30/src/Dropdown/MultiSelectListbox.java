package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/USER/OneDrive/Desktop/Month.html");
		
		WebElement month = driver.findElement(By.id("month"));
		Select monSel=new Select(month);
		monSel.selectByIndex(0);
		monSel.selectByValue("F");
		monSel.selectByVisibleText("Apr");
		
//		monSel.deselectByIndex(0);
//		monSel.deselectByValue("F");
//		monSel.deselectByVisibleText("Apr");
		
		monSel.deselectAll();
	}

}
