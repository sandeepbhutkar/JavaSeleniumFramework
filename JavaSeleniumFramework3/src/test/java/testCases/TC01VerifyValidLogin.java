package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.pageLogin;
import utility.Utility;

public class TC01VerifyValidLogin extends BaseClass {
	
	
	

	@Test
	public void verifyValidLogin() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("Admin");
		pg.setPassword("admin123");
		pg.clickLogin();
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actual, expected);
		
		

	}
	
	

}
