package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01DemoAutomation {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbhutkar\\Downloads\\New\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).sendKeys("mobile");
		driver.findElement(By.cssSelector("input.btn.btn-prim.gh-spr")).click();
		driver.close();
		
		
		

	}

}
