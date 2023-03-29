package pawanInterviewQuestionPrac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06GetTextVsGetAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement we = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		System.out.println(we.getText());
		System.out.println(we.getAttribute("id"));
		System.out.println(we.getAttribute("name"));
		System.out.println(we.getAttribute("class"));

	}

}
