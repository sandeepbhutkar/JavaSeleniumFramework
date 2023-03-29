import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01OrAnd {
	
	//handling dynamic changing webelement locator

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username' or @placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password' and @type='password']")).sendKeys("admin123");
		//Thread.sleep(3);
		//driver.close();
		

	}

}
