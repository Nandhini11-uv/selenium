package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass{
	@Test
	
	public void clickOnComputers() {
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computer","Computers page is not displayed");
		Reporter.log("Computers page is displayed",true);
	}

}
