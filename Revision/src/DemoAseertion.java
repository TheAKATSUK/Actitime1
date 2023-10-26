import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAseertion {
	
	@Test
	public void titleComparison() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		String actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(expectedTitle,actualtitle);
		Thread.sleep(3000);	 	
		driver.close();
		s.assertAll();
		
	}

} 
