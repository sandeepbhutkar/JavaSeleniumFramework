package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC10Links {
	//Selenium WebDriver Tutorial #19 - How to Print all Links of a Webpage
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		//driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println(all_links.size());
		for (int i=0;i<all_links.size();i++) {
			System.out.println(all_links.get(i).getText());
			System.out.println(all_links.get(i).getAttribute("href"));
			
		}
	}
}
