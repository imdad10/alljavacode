package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablerows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver =  new ChromeDriver(); 
		driver.get("http://qaclickacademy.com/practice.php");
//		WebElement table = driver.findElement(By.cssSelector("table[class='table-display'] tbody"));
//		System.out.println(table.findElements(By.tagName("tr")).size());
//
//		List<WebElement> coul = table.findElements(By.cssSelector(".table-display tr")).get(0)
//				.findElements(By.tagName("th"));
//		System.out.println(coul.size());
//
//		String ss = table.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
//		System.out.println(ss);
		
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
	List<WebElement> hhh=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
       for(WebElement ment:hhh) {
    	  if (ment.getText().equalsIgnoreCase("India")){
    		   
    		  System.out.println(ment.getText());
    		  ment.click();
    		 break;
    	   }
	
           }		

	}
	
	

}
