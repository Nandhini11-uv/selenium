package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM {
	@Test
	public void launch() {
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.ktmindia.com/");
		  
		  Reporter.log("KTM launched",true);
	  }

}
