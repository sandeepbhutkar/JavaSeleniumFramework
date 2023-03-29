package baseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Utility;

public class BaseClass {
	
	public  WebDriver driver;
	
	public  String browser = "edge";
	public  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    
	@BeforeMethod
	public  void setup() {
	
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Browser Invalid");
		}



	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException { 
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.captureScreenshot(driver, result.getName());
		}
		driver.close();
	}
	
	//@AfterMethod
	//public void close() {
	//	driver.close();
	//}

}
