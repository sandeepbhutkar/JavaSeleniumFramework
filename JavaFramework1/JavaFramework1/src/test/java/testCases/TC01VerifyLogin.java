package testCases;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import base.Base;
import pages.LoginPage;

public class TC01VerifyLogin extends Base {
	

	@Test(priority=1,groups="smoke")
	public void verifyValidLogin() throws InterruptedException, IOException  {
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("admin@yourstore.com");
		lp.setPassword("admin");
		lp.clickLoginButton();	
		Thread.sleep(2000);
		SoftAssert softassert = new SoftAssert();
		String er = "Dashboard / nopCommerce administration";
		String ar = driver.getTitle();
		softassert.assertEquals(ar, er);
		File TakesScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(TakesScreenshot, new File(
				"C:\\Users\\sbhutkar\\eclipse-workspace\\JavaFramework1\\JavaFramework1\\src\\test\\resources\\screenshots\\verifyValidLogin.png"));		
		Thread.sleep(2000);
		softassert.assertAll();
		
	}
	
	@Test(priority=1,groups="smoke")
	public void verifyInValidLogin() throws InterruptedException, IOException  {
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("admin@yourstore.com1");
		lp.setPassword("admin1");
		lp.clickLoginButton();	
		Thread.sleep(2000);
		SoftAssert softassert = new SoftAssert();
		String er = driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]")).getText();
		System.out.println(er);
		String ar = "No customer account found";
		softassert.assertEquals(ar, er);
		File TakesScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(TakesScreenshot, new File(
				"C:\\Users\\sbhutkar\\eclipse-workspace\\JavaFramework1\\JavaFramework1\\src\\test\\resources\\screenshots\\verifyInValidLogin.png"));		
		Thread.sleep(2000);
		softassert.assertAll();
		
	}
	
	
		
		
	

}
