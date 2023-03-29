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

public class TC02VerifyInValidLogin extends BaseClass {
	
	
	

	@Test
	public void verifyInValidLogin() throws InterruptedException {
		
		pageLogin pg = new pageLogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.setUserName("Admin12wrss");
		pg.setPassword("admin123fgvg");
		pg.clickLogin();
		Thread.sleep(5);
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		Assert.assertEquals(actual, expected);
		
		

	}

}
