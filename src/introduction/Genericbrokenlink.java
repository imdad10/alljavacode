package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericbrokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		List<WebElement>  ele=driver.findElements(By.tagName("a"));
		
	//	ele.addAll(driver.findElements(By.tagName("img")));
		 System.out.println("size of links and images" + " " + ele.size());
		 
		List<String>  activelinks=new ArrayList<String>();
		
		/*for(int i=0;i<ele.size();i++) 
		{
			if(ele.get(i).getAttribute("href")!=null && (!ele.get(i).getAttribute("href").contains("JavaScript"))) 
			{
				activelinks.add(ele);
			}
		}*/
		
		
		for(WebElement lin:ele)
		{
			String urls=lin.getAttribute("href");
			//activelinks.add(urls);
			if(lin.getAttribute("href")!=null && (!lin.getAttribute("href").contains("javascript"))) 
			{
				activelinks.add(urls);
			}
		}
		
		
		
		
		
		// System.out.println("size of links and images" + " " + activelinks.size());
		 
		/* for(int j=0;j<activelinks.size();j++)
			{
				String urls=activelinks.get(j).getAttribute("href");
				HttpURLConnection connection= (HttpURLConnection) new URL(urls).openConnection();
				connection.connect();
				String resp=connection.getResponseMessage();
				connection.disconnect();
				System.out.println(urls + " --> "+  resp);
			}*/
		
		
		activelinks.parallelStream().forEach(e ->{
			try {
				checkbrokenlink(e);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
	}
	
	public static void checkbrokenlink(String linkurl) throws MalformedURLException, IOException
	{
		HttpURLConnection connection= (HttpURLConnection) new URL(linkurl).openConnection();
		connection.setConnectTimeout(5000);
	//	String resp=connection.getResponseMessage();
		connection.connect();
		
		if(connection.getResponseCode()>=400) 
		{
			System.out.println(linkurl + "  " + connection.getResponseMessage() + " is a broken link"); 
		}else {
			System.out.println(linkurl + " " + connection.getResponseMessage());
		}
	}
	

}
