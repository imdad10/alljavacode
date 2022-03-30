package introduction;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ja");
		Thread.sleep(3000);
		//ui-id-1    li
		List<WebElement> ele=driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
		
		for(WebElement obj:ele) 
		{
			if(obj.getText().equals("Japan")) {
				obj.click();
				break;
			}
		}
		
	}

}
