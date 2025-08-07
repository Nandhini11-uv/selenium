package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment25 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://x.com/");
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
	    WebElement month = driver.findElement(By.id("SELECTOR_1"));
	    
	    Select monSel=new Select(month);
	    
	    int allOptions = monSel.getOptions().size();
	    
	    System.out.println(allOptions);
	    
	    for(int i=1;allOptions-1>=i; i++) {
	    	monSel.selectByIndex(i);
	    	
	    	Thread.sleep(1000);
	    }
	}
}
