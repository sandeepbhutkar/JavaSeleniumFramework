package pawanInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//drop downs which does not have Select tags in html codes, so we cannot use Select class.

public class TC08BootStrapDropDown {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		TC08BootStrapDropDown dd = new TC08BootStrapDropDown();
		dd.selectDropDownValue("choice 6 2 1");
	
		/*driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> dl = driver.findElements(By.cssSelector("li.ComboTreeItemChlid"));
		for (int i =0; i<=dl.size();i++) {
			dl.get(i).getText();
			if (dl.get(i).getText().equalsIgnoreCase("choice 6 2 3")){
				dl.get(i).click();
				
			}*/
	}
		

	
	public void selectDropDownValue(String value) throws InterruptedException {
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> dl = driver.findElements(By.cssSelector("li.ComboTreeItemChlid"));
		for (int i =0; i<=dl.size();i++) {
			dl.get(i).getText();
			if (dl.get(i).getText().equalsIgnoreCase(value)){
				Thread.sleep(3000);
				dl.get(i).click();
			}
				
		}
			
	}

}
