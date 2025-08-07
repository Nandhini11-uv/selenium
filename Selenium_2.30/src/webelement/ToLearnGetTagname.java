package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String tagname = driver.findElement(By.xpath("//input[@value='Search']")).getTagName();
		System.out.println(tagname);
		
		String registertagname = driver.findElement(By.linkText("Register")).getTagName();
		System.out.println(registertagname);
		
		
	}

}
