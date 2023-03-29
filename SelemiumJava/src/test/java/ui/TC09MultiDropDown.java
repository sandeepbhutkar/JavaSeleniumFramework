package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC09MultiDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement mdd = driver.findElement(By.id("cars"));
		
		Select select = new Select(mdd);
		select.selectByIndex(3);
		select.selectByIndex(2);
		
		List <WebElement> all_value = select.getAllSelectedOptions();
		System.out.println(all_value.size());
		List <WebElement> all_op =select.getOptions();
		System.out.println(all_op);
		
		WebElement print_text = select.getFirstSelectedOption();
		System.out.println("value is: " + print_text.getText());
		
		
		

	}

}
