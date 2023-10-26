package com.Actitime.Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import Testng.BaseClass;

@Listeners(Listenerimplementation.class)

public class Utilization extends BaseClass{

	@Test
	public void createCustomer() {
		Reporter.log("customer created",true);
		Assert.fail();
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("customer deleted",true);
		Assert.fail();
	}
	
}
