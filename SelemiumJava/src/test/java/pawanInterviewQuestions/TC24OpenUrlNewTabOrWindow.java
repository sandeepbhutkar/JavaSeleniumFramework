package pawanInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC24OpenUrlNewTabOrWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//new feature in selenium 4
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.bing.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.bing.com");
		
	}

}
