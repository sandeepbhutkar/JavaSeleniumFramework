package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.pageLogin;

public class TC06ScreenshotForFailedTestCases extends BaseClass {
	
	
	

	@Test
	public void verifyValidLogin() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("wrongUserName");
		pg.setPassword("wrongPassword");
		pg.clickLogin();
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList123";
		Assert.assertNotEquals(actual, expected);
		
		

	}
	@Test
	public void verifyInValidLogin() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("Admin");
		pg.setPassword("admin123");
		pg.clickLogin();
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList123";
		Assert.assertEquals(actual, expected);
		
		

	}
	@Test
	public void verifyTitle() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("Admin");
		pg.setPassword("admin123");
		pg.clickLogin();
		String actual = driver.getTitle();
		String expected = "OrangeHRM123";
		Assert.assertEquals(actual, expected);
		
		

	}
	@Test
	public void verifyURL() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("Admin");
		pg.setPassword("admin123");
		pg.clickLogin();
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList123";
		Assert.assertEquals(actual, expected);

	}
	
}	
	