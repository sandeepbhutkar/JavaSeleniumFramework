import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02Contains {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Admin");
		//handling dynamic changing webelement locator , give partial locator name='username'
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("admin123");
		//handling dynamic changing webelement locator , give partial locator name='password'
		

	}

}
