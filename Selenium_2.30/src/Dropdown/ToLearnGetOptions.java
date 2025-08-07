package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://x.com/");
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select monSel=new Select(month);
		List<WebElement> allOptions = monSel.getOptions();
        System.out.println(allOptions.size());
        
		
		WebElement day = driver.findElement(By.id("SELECTOR_2"));
		Select daySel=new Select(day);
		List<WebElement> everyOptions = daySel.getOptions();
		System.out.println(everyOptions.size());//PRINTS ADDRESS OF THE ELEMENT...
		System.out.println(everyOptions);
		
		WebElement year = driver.findElement(By.id("SELECTOR_3"));
		Select yearSel=new Select(year);
		List<WebElement> everyOptions1 = yearSel.getOptions();
		System.out.println(everyOptions1.size());
		
		for(WebElement mon:allOptions) {
			System.out.println(mon.getText());//FOR MONTHS..
		}
		
		for(WebElement days:everyOptions) {
			System.out.println(days.getText());//FOR DAYS..
		}
		
		for(WebElement yr:everyOptions1) {
			System.out.println(yr.getText());
		}
		
		
	}

}
		
		
		
