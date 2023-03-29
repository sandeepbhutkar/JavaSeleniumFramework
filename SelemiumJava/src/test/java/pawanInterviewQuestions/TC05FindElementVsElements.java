package pawanInterviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05FindElementVsElements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/register");
		WebElement sb = driver.findElement(By.cssSelector("input[id=small-searchterms]"));
		sb.sendKeys("tester");
		List<WebElement> allinks = driver.findElements(By.tagName("a"));
		System.out.println(allinks.size());
		for (int i=0;i<=allinks.size();i++) {
			
			System.out.println(allinks.get(i).getText());
			System.out.println(allinks.get(i).getAttribute("href"));
			
		}

	}

}
