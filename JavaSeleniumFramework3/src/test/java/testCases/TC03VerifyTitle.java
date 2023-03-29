package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.pageLogin;

public class TC03VerifyTitle extends BaseClass {
	
	
	

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

}
