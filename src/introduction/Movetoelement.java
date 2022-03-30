package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		
		ChromeOptions rrr=new ChromeOptions();
		rrr.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking","enable-automation"));
		WebDriver driver= new ChromeDriver(rrr);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();

		}
		
		
		
		List<WebElement> fff=driver.findElements(By.cssSelector(".day"));
		int count=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=1;i<count;i++) {
			String sss=driver.findElements(By.cssSelector(".day")).get(i).getText();
			
			if(sss.contains("23")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
		
		WebElement ele=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//div[@id='nav_desktop_first']//a[@title='Visitor Visa Interview Questions']")).click();
		
	
		//WebElement elem=driver.findElement(By.xpath("//div //div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']"));
		//elem.click();
		//popups(driver,30); 
	}
	/*public static void popups(WebDriver driver,int timeouts) {
       // WebElement elem=driver.findElement(By.xpath("//div[@class='listbuilder-popup-scale'] //div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']"));

		new WebDriverWait(driver, Duration.ofSeconds(timeouts))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='listbuilder-popup-scale'] //div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")));
	    driver.findElement(By.xpath("//div[@class='listbuilder-popup-scale'] //div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")).click();

	}*/
	}

