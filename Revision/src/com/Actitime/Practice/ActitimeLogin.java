package com.Actitime.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		DataDrivenTesting d=new DataDrivenTesting();
	String data = d.readDataFromPropertyFile("url");
		driver.get(data);
		String username = d.readDataFromPropertyFile("un");
		driver.findElement(By.id("username")).sendKeys(username);
		String password = d.readDataFromPropertyFile("pw");
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("x`Login in ']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
	

}
