package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC17ActionS {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//MouseHover
		Actions actions = new Actions(driver);
		WebElement mousehover = driver.findElement(By.id("age"));
		actions.moveToElement(mousehover).perform();
		Thread.sleep(2000);
		//Double CLick
		WebElement DoubleClick = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		actions.doubleClick(DoubleClick).perform();
		Thread.sleep(2000);
		//Right CLick
		WebElement RightClick = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		actions.contextClick(RightClick).perform();
		Thread.sleep(2000);
		
		//SLider
		WebElement slider = driver.findElement(By.cssSelector("span.ui-slider-handle.ui-corner-all.ui-state-default"));
		actions.dragAndDropBy(slider, 50, 0).pause(0);
		Thread.sleep(2000);
		//Drag Drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(drag, drop).perform();
		//Resize
		WebElement resize = driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		actions.dragAndDropBy(resize, 70, 0).perform();

	}

}
