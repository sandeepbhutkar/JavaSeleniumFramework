package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC13RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium WebDriver Tutorial #20 - How to Handle Auto Suggestion Dropdown
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//select radio
		driver.findElement(By.cssSelector("li[data-cy=roundTrip]")).click();
		//To Find number of radio.
		driver.findElements(By.cssSelector("span.tabsCircle.appendRight5")).size();
		System.out.println("Number of Radio Buttons are "+driver.findElements(By.cssSelector("span.tabsCircle.appendRight5")).size());
		
	}

}
