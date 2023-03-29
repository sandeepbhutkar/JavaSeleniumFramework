package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC23Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr[2]/td"));
		System.out.println(columns.size());
		
		for (int i=2;i<=rows.size();i++) {
			for (int j=1;j<=columns.size();j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText());
				
			}
			System.out.println();
		}
		
		driver.close();

	}

}
