package pawanInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC17Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_syntax.asp");
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/table/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/table/tbody/tr"));
		System.out.println(rows.size());
		System.out.println(columns.size());
		for(int i=2;i<=rows.size();i++) {
			for (int j=1;j<=columns.size();j++) {
				System.out.println(driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
				
			}
			System.out.println();
		}
		

	}

}
