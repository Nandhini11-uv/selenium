package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.demowebshopHomePage;

public class TestScript6 extends BaseClassDemowebshop{
	@Test
	public void clickOnComputers() {
		demowebshopHomePage hp=new demowebshopHomePage(driver);
		hp.getComputersLink().click();
		
		//HARD ASSERT....
		
//		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computer","Computers page is not displayed");
//		Reporter.log("Computers page is displayed",true);
//		
		//SOFT ASSERT...
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web Shop. Computer","Computers page is not displayed");
		soft.assertAll();
	}

}
