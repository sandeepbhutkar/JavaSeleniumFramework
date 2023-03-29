package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11AutoSuggestionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium WebDriver Tutorial #20 - How to Handle Auto Suggestion Dropdown
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.cssSelector("input[placeholder=From]")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[placeholder=From]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[placeholder=From]")).sendKeys(Keys.ENTER);
		
		
	}

}
