package ui;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC16HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		String wh1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]")).click();
		//Thread.sleep(3000);
		String wh2 = driver.getWindowHandle();
		driver.switchTo().window(wh2);
		driver.findElement(By.id("UserFirstName-wMGt")).sendKeys("Sandeep");
		

	}

}
