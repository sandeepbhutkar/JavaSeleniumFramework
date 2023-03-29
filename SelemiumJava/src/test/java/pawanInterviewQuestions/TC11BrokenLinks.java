package pawanInterviewQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11BrokenLinks {

	public static void main(String[] args) throws IOException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.deadlinkcity.com/");
			List<WebElement> links = driver.findElements(By.tagName("a"));
		
			//for (WebElement element:links)
			for (int i = 0 ; i <links.size() ; i++)
			{
				String url =links.get(i).getAttribute("href");
				URL link = new URL(url);
				HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400)
				{
					System.out.println(httpconn.getResponseCode()+url+" is"+"Broken link");
					}
			}
			

		


	}

}
