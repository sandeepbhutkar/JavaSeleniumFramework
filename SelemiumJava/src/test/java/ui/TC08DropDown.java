package ui;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC08DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dp = driver.findElement(By.id("products"));
		Select select = new Select(dp);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByVisibleText("Bing");
		Thread.sleep(3000);
		select.selectByValue("Yahoo");
		Thread.sleep(3000);
		driver.close();
		
	}
}
