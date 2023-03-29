package pawanInterviewQuestions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC10Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> l = driver.findElements(By.tagName("a"));
		for (int i = 0; i<l.size();i++) {
			System.out.println(l.get(i).getAttribute("href"));
			System.out.println(l.get(i).getText());		}
		

	}

}
