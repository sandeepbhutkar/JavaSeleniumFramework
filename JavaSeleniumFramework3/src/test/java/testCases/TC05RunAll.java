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

public class TC05RunAll extends BaseClass {
	
	
	

	@Test
	public void verifyValidLogin() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("wrongUserName");
		pg.setPassword("wrongPassword");
		pg.clickLogin();
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
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
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
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
		String expected = "OrangeHRM";
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
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		Assert.assertEquals(actual, expected);
		
		

	}
	
	@Test
     public void verifyURL_Fail_for_Screenshot() throws InterruptedException, IOException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("Admin");
		pg.setPassword("admin123");
		pg.clickLogin();
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList123";
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Test case passed");		
		}
		else {
			TakesScreenshot ts = (TakesScreenshot)(driver);
			File scr = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File("C:\\Users\\sbhutkar\\eclipse-workspace\\JavaSeleniumFramework3\\src\\test\\resources\\Screenshots\\verifyURL_Fail_for_Screenshot.png");
			FileUtils.copyFile(scr, trg);
			
		}
		
		

	}
	
}	
	