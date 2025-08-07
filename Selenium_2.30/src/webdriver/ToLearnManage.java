package webdriver;

import javax.sound.sampled.Line;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		
		//Instead of using 3 lines of code we are writing in a single Line.
	}

}
