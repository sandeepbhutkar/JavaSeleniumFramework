package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04SoftAssert {
	
	@Test
	public void TestingSoftAssert()
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		SoftAssert softassert = new SoftAssert();
		
		//Difference between assert and softassert - assert will stop script exe. 
		//when assert fails
		//SoftAssert will continue script even if assert fails.
		
		driver.get("https://www.ebay.com/");
		//Verify Title
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ActualTitle = driver.getTitle();
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		//Verify Text
		String ExpectedText = "Help & Contact";
		String ActualText = driver.findElement(By.linkText("Help & Contact")).getText();
		softassert.assertEquals(ActualText, ExpectedText);
		driver.close();
		softassert.assertAll();
		
		
	}

}
