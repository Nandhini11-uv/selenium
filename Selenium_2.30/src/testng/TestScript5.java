package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.demowebshopHomePage;

public class TestScript5 extends BaseClassDemowebshop{
	@Test
	public void clickOnBooks() {
		demowebshopHomePage hp=new demowebshopHomePage(driver);
		hp.getBooksLink().click();
		
		//HARD ASSERT....
		
//		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Book","Books page is not displayed");
//		Reporter.log("Books page is displayed",true);
		
		//SOFT ASSERT....
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web Shop. Book","Books page is not displayed");
		soft.assertAll();
		
	}

}

