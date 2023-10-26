package com.Actitime.Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

import Testng.BaseClass;

public class Listenerimplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result){
		 String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+name+".png");
		try {
			Files.copy(dest, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void databaseconnection() {
		// TODO Auto-generated method stub
		super.databaseconnection();
	}

	@Override
	public void launchBrowser() {
		// TODO Auto-generated method stub
		super.launchBrowser();
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		super.login();
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		super.logout();
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		super.closeBrowser();
	}

	@Override
	public void databasedisconnected() {
		// TODO Auto-generated method stub
		super.databasedisconnected();
	}
	

}
