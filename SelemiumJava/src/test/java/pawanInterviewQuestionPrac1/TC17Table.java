package pawanInterviewQuestionPrac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC17Table {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> col = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr[2]/td"));
		System.out.println(col.size());
		List<WebElement> row = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr"));
		System.out.println(row.size());
		
		for(int i=2;i<row.size();i++) {
			for(int j=1;j<col.size();j++) {
				System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/div[1]/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
		
	}

}
