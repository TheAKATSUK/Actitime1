package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("browser launched",true);
	}
		
	@BeforeMethod
	public void login() {
		Reporter.log("login succesfully",true);
	}
	
	@Test
	public void createCustomer() {
		Reporter.log("create customer",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logged out succesfully",true);
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("browser closed",true);
	}
	
	@AfterSuite
	public void databaseDisconnect() {
		Reporter.log("database Disconnected",true);
	} 
	

}
