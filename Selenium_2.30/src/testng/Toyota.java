package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Toyota {
  @Test(groups = "system")
  public void launch() {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.toyotabharat.com/");
	  
	  Reporter.log("Toyota launched",true);
  }
}
