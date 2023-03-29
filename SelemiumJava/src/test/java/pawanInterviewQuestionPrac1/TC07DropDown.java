package pawanInterviewQuestionPrac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dd = driver.findElement(By.xpath("//select[@name='speed']"));
		Select select = new Select(dd);
		select.selectByIndex(1);
		//select.selectByValue();
		Thread.sleep(3000);
		select.selectByVisibleText("Fast");
		

	}

}
