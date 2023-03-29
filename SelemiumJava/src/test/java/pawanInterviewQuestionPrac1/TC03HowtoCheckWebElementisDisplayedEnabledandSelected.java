package pawanInterviewQuestionPrac1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03HowtoCheckWebElementisDisplayedEnabledandSelected {
	
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).click();
		System.out.println(driver.findElement(By.name("q")).isDisplayed());
		System.out.println(driver.findElement(By.name("q")).isEnabled());
		System.out.println(driver.findElement(By.name("q")).isSelected());
		driver.close();
		
	}

}
