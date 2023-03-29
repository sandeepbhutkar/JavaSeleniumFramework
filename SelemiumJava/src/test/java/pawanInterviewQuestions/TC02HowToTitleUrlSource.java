package pawanInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*how to open borwser
 * open url
 * get title
 * get url
 * get page source
 * */
public class TC02HowToTitleUrlSource {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://frontend.nopcommerce.com/");
		System.out.println("Title is: "+ driver.getTitle());
		System.out.println("Url is: "+ driver.getCurrentUrl());
		System.out.println("Page Source is: "+ driver.getPageSource());
		driver.close();
		
	}

}
