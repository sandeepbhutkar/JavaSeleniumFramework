package pawanInterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//1. How to Check WebElement is Displayed, Enabled and Selected?
public class TC03HowtoCheckWebElementisDisplayedEnabledandSelected {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/register");
		driver.findElement(By.cssSelector("input[id=small-searchterms]")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[id=small-searchterms]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=small-searchterms]")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[id=small-searchterms]")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id=small-searchterms]")).isEnabled());
		
	
	}

}
