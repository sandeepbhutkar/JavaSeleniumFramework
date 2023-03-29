package pawanInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC25Headless {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);	
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	}

}
