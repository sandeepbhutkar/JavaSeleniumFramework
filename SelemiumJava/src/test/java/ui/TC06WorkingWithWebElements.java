package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06WorkingWithWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
		//get attributes like , name, id, class, value
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		//get css values
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getCssValue("text-transform"));
		//get size of button
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getSize());
		//get location
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getLocation());
		//get tag name
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getTagName());
		//get text
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'What type of solution are you looking for?')]")).getText());
		
		//driver.close();

	}

}
