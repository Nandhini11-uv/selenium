package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import pom.demowebshopHomePage;

public class TestScript4 extends BaseClassDemowebshop {
	@Test
	public void clickOnElectronics() {
	    demowebshopHomePage hp=new demowebshopHomePage(driver);
	    hp.getElectronicsLink().click();
	
	    //HARD ASSERT.....
	    
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronic","Electronics page is not displayed");
		Reporter.log("Electronics page is displayed",true);
	    
	    //SOFT ASSERT.....
	    
//	    SoftAssert soft=new SoftAssert();
//	    soft.assertEquals(driver.getTitle(), "Demo Web Shop. Electronic","Electronics page is not displayed");
//	    soft.assertAll();
//		
	}
	

}
