package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sandisk {
	@Test(groups = "regression")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sandisk.com/company/about-us");
		Reporter.log("sandisk launched",true);
	}

}
