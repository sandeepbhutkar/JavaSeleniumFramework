package testCases;

import org.testng.annotations.Test;
import base.Base;
import pages.CreateCustomerPage;
import pages.LoginPage;

public class TC02CreateCustomer extends Base {
	
	@Test
	public void createCustomer() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("admin@yourstore.com");
		lp.setPassword("admin");
		lp.clickLoginButton();
		
		CreateCustomerPage cp = new CreateCustomerPage(driver);
		cp.clickCustomersTab();
		cp.clickCustomersSubTab();
		cp.clickAddNewButton();
		cp.setEmail("sss@ss.com");
		cp.setPassword("pass");
		cp.setFirstName("sss");
		cp.setLastName("nnnn");
		
		Thread.sleep(2000);
		
		
		
		
	}

}
