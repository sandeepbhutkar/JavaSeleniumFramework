package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.GooglePage;

public class TC01Google extends BaseTest {
	
	GooglePage gp = new GooglePage(driver);
	
	@AfterMethod
	public void failTestCaseSS(ITestResult result) throws IOException {
		if (ITestResult.FAILURE==result.getStatus()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File("C:\\Users\\sbhutkar\\eclipse-workspace\\JavaSeleniumFramework2\\src\\test\\resources\\Screenshots\\TitleFails.png");
			FileUtils.copyFile(src, trg);
			
		}
		
		
	}
	
	@Test(priority=1,groups="smoke")
	public void getTitle() throws IOException{
		System.out.println(driver.getTitle());
		String actual = driver.getTitle();
		String expected = "Google1";
		Assert.assertEquals(actual, expected);
		
		//SoftAssert softassert = new SoftAssert();
		//softassert.assertNotEquals(actual, expected);
	
		/*if(actual.equals(expected)) {
			System.out.println("Title test case is passed");
		}
		else  {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File("C:\\Users\\sbhutkar\\eclipse-workspace\\JavaSeleniumFramework2\\src\\test\\resources\\Screenshots\\TitleFails.png");
			FileUtils.copyFile(src, trg);
			Assert.assertEquals(actual, expected);
			
				
				
			
		}*/
		}
	
	@Test()
	public void getURL(){
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test()
	public void search() throws IOException {
		GooglePage gp = new GooglePage(driver);
		gp.setSearch("sandeep");
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File src = ts.getScreenshotAs(OutputType.FILE);
		//File trg = new File("C:\\Users\\sbhutkar\\eclipse-workspace\\JavaSeleniumFramework2\\src\\test\\resources\\Screenshots\\GooglePage.png");
		//FileUtils.copyFile(src, trg);
		
	}
	

}
