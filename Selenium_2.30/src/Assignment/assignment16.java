package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment16 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		
        Set<String> ids = driver.getWindowHandles();
        
        for(String id:ids) {
        	driver.switchTo().window(id);
        	String actUrl = driver.getCurrentUrl();
  			if(actUrl.equals("https://demo.vtiger.com/")) {
  				break;}
  			
  			//if(driver.getCurrentUrl().equals("https://demo.vtiger.com/")){
  			//break;}
        }
    	Rectangle rect2 = driver.findElement(By.partialLinkText("GET A DEMO")).getRect();
			System.out.println(rect2.getHeight());
			System.out.println(rect2.getWidth());
			System.out.println(rect2.getX());
			System.out.println(rect2.getY());
			//driver.quit;
 }

}
