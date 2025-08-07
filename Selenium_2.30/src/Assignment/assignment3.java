package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//to get into the page using get() method...
		driver.get("https://www.instagram.com/");
		
		//to capture the sourceCode....
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		//to resize the window to 450(W),250()...
		driver.manage().window().setSize(new Dimension(450, 250));

		
	}

}
