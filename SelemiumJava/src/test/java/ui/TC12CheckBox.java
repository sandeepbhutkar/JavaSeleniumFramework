package ui;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//button[contains(text(),'Accept All Cookies')]")).click();
		Thread.sleep(3000);
		//Check
		driver.findElement(By.id("interest_market_c0")).click();
		Thread.sleep(3000);
		//Uncheck
		driver.findElement(By.id("interest_market_c0")).click();
		//Find number of checkbox.
		System.out.println("Number of Checkboxes="+driver.findElements(By.cssSelector("div.form-check.form-check-inline")).size());
		driver.close();

	}

}
