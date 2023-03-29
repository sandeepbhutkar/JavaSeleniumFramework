package pawanInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC20Keyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://the-internet.herokuapp.com/key_presses");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.CANCEL).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		//open new tab
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("t");
		actions.keyUp(Keys.CONTROL);
		actions.perform();*/
		//Pressing two keys
		Actions actions = new Actions(driver);
		driver.get("https://text-compare.com/");
		driver.findElement(By.id("inputText1")).sendKeys("Hello Krish");
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		
		actions.sendKeys(Keys.TAB).perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		
		
	}

}
