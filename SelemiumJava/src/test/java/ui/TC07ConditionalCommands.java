package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07ConditionalCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).isSelected());
		//DES
		
	}

}
