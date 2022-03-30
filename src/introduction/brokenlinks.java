package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		List<WebElement>  ele=driver.findElements(By.tagName("a"));
		//SoftAssert a=new SoftAssert();
		//ele.addAll(driver.findElements(By.tagName("img")));
		System.out.println("total links and images are" + " " +  ele.size());
		
		for(WebElement link:ele)
		{
			String urls=link.getAttribute("href");
			HttpURLConnection connection= (HttpURLConnection) new URL(urls).openConnection();
			
			connection.setRequestMethod("HEAD");
			connection.connect();
			int resp=connection.getResponseCode();
			System.out.println(resp);
			//System.out.println(urls );
			if(resp>400) {
				System.out.println("the link with the text" + link.getText() + " is broken with the code " + resp);
				
			}else {
				System.out.println("the link is not broken");
			}
		}
		
		//List<WebElement>  elem=driver.findElements(By.tagName("img"));
		
		
		
	}

}
