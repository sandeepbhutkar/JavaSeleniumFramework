package pawanInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//GetText - return the text dispalyed on UI
//GetAttribute will return value of attribute like id, name, class etc.
public class TC06GetTextVsGetAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement txt= driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]/strong"));
		System.out.println(txt.getText());
		WebElement email = driver.findElement(By.id("Email"));
		System.out.println(email.getAttribute("id"));
		System.out.println(email.getAttribute("name"));
		System.out.println(email.getAttribute("class"));
		

	}

}
