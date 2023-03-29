package pawanInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC19MouseActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("age"))).perform();
		
		actions.contextClick(null);
		actions.doubleClick();
		actions.moveByOffset(0, 0);
		actions.dragAndDrop(null, null);

	}

}
