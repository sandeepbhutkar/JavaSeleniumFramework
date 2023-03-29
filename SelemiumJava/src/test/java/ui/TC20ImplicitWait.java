package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC20ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//MouseHover
		Actions actions = new Actions(driver);
		WebElement mousehover = driver.findElement(By.id("age"));
		actions.moveToElement(mousehover).perform();
		
		//Double CLick
		WebElement DoubleClick = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		actions.doubleClick(DoubleClick).perform();
		
		//Right CLick
		WebElement RightClick = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		actions.contextClick(RightClick).perform();
		
		
		//SLider
		WebElement slider = driver.findElement(By.cssSelector("span.ui-slider-handle.ui-corner-all.ui-state-default"));
		actions.dragAndDropBy(slider, 50, 0).pause(0);
		
		//Drag Drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(drag, drop).perform();
		//Resize
		WebElement resize = driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		actions.dragAndDropBy(resize, 70, 0).perform();

	}

}
