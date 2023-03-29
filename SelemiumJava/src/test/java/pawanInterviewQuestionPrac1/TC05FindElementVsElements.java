package pawanInterviewQuestionPrac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05FindElementVsElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for(int i=0;i<list.size();i++) {
        	System.out.println("Link is :" + list.get(i).getText());
        	System.out.println("URL is :" + list.get(i).getAttribute("href"));
        }
        
	}

}
