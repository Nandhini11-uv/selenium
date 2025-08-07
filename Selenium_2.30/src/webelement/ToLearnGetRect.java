package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class ToLearnGetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		Rectangle rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
//		System.out.println(rect.getHeight());
//		System.out.println(rect.getWidth());
//		System.out.println(rect.getX());
//		System.out.println(rect.getY());
		
		Rectangle rect2 = driver.findElement(By.xpath("//input[@value='Vote']")).getRect();
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		System.out.println(rect2.getX());
		System.out.println(rect2.getY());
	}

}
