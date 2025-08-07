package Assignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class assignment37 {
	@Test(priority = 1)
	public void createAccount() {
		Reporter.log("Account is created",true);
	}
	@Test(priority = 2)
	private void editAccount() {
		Reporter.log("Account is edited",true);
	}
	@Test(priority = 3)
	private void deleteAccount() {
		Reporter.log("Account is deleted",true);
	}

}
