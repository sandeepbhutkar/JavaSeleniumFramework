package pawanInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC15Frames {
//diff between frames and iframes - frames where source is same, i frames where source is diff.
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement outerFrame = driver.findElement(By.xpath("/html/body/div[5]/div[4]/div/div/iframe"));
		WebElement innerFrame = driver.findElement(By.xpath("/html/body/iframe"));
		Thread.sleep(5000);
		driver.switchTo().frame(outerFrame);
		System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
		driver.switchTo().frame(innerFrame);
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	}

}
