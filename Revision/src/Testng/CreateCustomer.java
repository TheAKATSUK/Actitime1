package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass {
	
	
	@Test(invocationCount =5, priority  = 3)
	public void create() {
		Reporter.log("customer created",true);        
	}
	@Test (priority = 2)
	public void modifycustomer() {                                                             
		Reporter.log("customer modified",true);
	}
	@Test (priority = 1)                 
	public void deletecustomer() {
		Reporter.log("customer deleted",true);
	}
		
	

		
	
	
	}

	

