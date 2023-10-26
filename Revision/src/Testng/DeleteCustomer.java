package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DeleteCustomer {
	@Test
	public void create() {
		Reporter.log("customer created",true);
	}
	@Test
	public void delete() {
		Reporter.log("deleted customer",true);
	}	
	@Test(invocationCount = 5)
	public void modify() {
		Reporter.log("modified customer",true);
	}

}
