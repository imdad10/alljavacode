package introduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();

		WebElement first = driver.findElement(By.xpath("//div[@id='results']"));
        Assign3.text(driver, first, 5);
	
		
	}
	
	public static void text(WebDriver driver, WebElement element, int timeout) {
		 new WebDriverWait(driver, Duration.ofSeconds(timeout))
	        .until(ExpectedConditions.visibilityOf(element));
	System.out.println(element.getText());
	}
	

}
