package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC19Scroll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		
		Actions actions = new Actions(driver);
		
		//Scroll
		WebElement scroll = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div[4]/a[1]"));
		actions.scrollToElement(scroll).perform();
		
	}

}
