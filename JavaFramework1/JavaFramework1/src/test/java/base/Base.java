package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties pr = new Properties();
	public static FileReader fr;
	

	
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		
		
		if (driver==null) {
			fr = new FileReader("C:\\Users\\sbhutkar\\eclipse-workspace\\JavaFramework1\\JavaFramework1\\src\\test\\resources\\configFiles\\config.properties");
			pr.load(fr);
		}
		if (pr.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pr.getProperty("url"));
		}
		else if (pr.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(pr.getProperty("url"));
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
