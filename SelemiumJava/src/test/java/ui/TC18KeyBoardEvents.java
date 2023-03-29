package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC18KeyBoardEvents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement source = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre"));
		Actions actions = new Actions(driver);
		actions.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement target = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		actions.keyDown(target, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		//Scroll
		WebElement scroll = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div[4]/a[1]"));
		actions.scrollToElement(scroll).perform();
		
	}

}
