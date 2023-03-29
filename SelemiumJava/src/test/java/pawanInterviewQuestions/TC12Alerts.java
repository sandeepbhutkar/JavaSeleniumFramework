package pawanInterviewQuestions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		
		al.sendKeys("Test");
		
		System.out.println(driver.switchTo().alert().getText());

	}

}
