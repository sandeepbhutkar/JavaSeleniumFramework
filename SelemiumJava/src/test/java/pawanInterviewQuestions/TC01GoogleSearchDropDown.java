package pawanInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01GoogleSearchDropDown {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("naveen automation");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.cssSelector("ul.erkvQe li span"));
		//System.out.println(driver.findElement(By.cssSelector("span.sa_tm_text")).getText());
		Thread.sleep(3000);
		//list.get(3).click();
		
		//System.out.println(list.get(2).getText());
		
		
		for (int i=0; i<=list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equalsIgnoreCase("naveen automation academy")){
				list.get(i).click();
				
			}
				
			
		}
			
			
			
		
		
	}

}
