package pawanInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*1. How to Navigate Back & Forward?
2. How to Refresh Page?
3. What is the difference between get() & navigate.to()?

get() is used to navigate url and wait till page load
navigate().to() is used to navigate url but does not wait till page load
it maintaons browser history/cookies to move back and forward.
*/


public class TC04NavigationCmds {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.bing.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.mj.com");
		
	}

}
