package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07Practice {
	public static WebDriver driver;
	
	@Test(priority=1,description="test desc",groups="smoke",enabled=false)
	public void google()
	{
		
		SoftAssert softassert = new SoftAssert();
		driver.get("https://www.google.com");
		String Actual = driver.getTitle();
		String Expected = "Google1";
		softassert.assertEquals(Actual, Expected);
		driver.findElement(By.name("q")).sendKeys("sandeep");
		
	}
	
	@Test(priority=2)
	public void bing()
	{
		
		driver.get("https://www.bing.com");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod()
	
	{
		//driver.close();
	}

}
