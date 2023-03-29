package pawanInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dd = driver.findElement(By.id("input-country"));
		Select select = new Select(dd);
		select.selectByIndex(3);
		select.selectByVisibleText("India");
		
		List<WebElement> all = select.getOptions();
		for(int i=0;i<=all.size();i++) {
			System.out.println(all.get(i).getText());
			if (all.get(i).getText().equals("Pakistan")){
				all.get(i).click();
				
				
			}
		}
		

	}

}
