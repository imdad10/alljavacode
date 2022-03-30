package introduction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		 String parentwindow=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement elem=driver.findElement(By.xpath("(//div[@id='gf-BIG']//ul)[1]"));
		int it=elem.findElements(By.tagName("a")).size();
		System.out.println(it);
		//Iterator<WebElement> num=elem.iterator();
		for(int num=1;num<it;num++) { 
			
			 String lol=Keys.chord(Keys.CONTROL,Keys.ENTER);
			 elem.findElements(By.tagName("a")).get(num).sendKeys(lol);
			 
			
		}
		Set<String> dom=driver.getWindowHandles();
		Iterator<String> lis= dom.iterator();
		
		while(lis.hasNext()) {
			 String til=driver.switchTo().window(lis.next()).getTitle();
			 System.out.println(til);
			 }
		
		//get the window we are looking for
		List<String> fff= new ArrayList<String>(dom);
		if(switchwindow(driver, "Appium", fff)){
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
		}
		parentwindows(driver, parentwindow, fff);
	//driver.switchTo().window(parentwindow);
		//System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
	
			}
	//to fall on the right window we created this method
	      public static boolean switchwindow(WebDriver driver,String Title,List<String> fff) {
	    	  
	    	  for(String lol:fff) {
	    		  String nnn= driver.switchTo().window(lol).getTitle();
	    		  System.out.println(nnn);
	    		  return true;
	    	  }
	    	  return false;
	      }
	      
	      public static void parentwindows( WebDriver driver, String parentwindow, List<String> fff ) {
	    	  
	    	  for(String hhh:fff) {
	    		  if(!hhh.equals(parentwindow)) {
	    			  driver.switchTo().window(hhh).close();
	    			 
	    		  }
	    		 
	    	  }
	      }
		
		}
		
		
	


