package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		//driver.findElement(By.cssSelector("a.theme-btn")).click();
		driver.findElement(By.className("theme-btn")).click();
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("imdad khan");
		driver.findElement(By.cssSelector("input[id='user_email']")).sendKeys("pathanimdad111@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("microsoftimdad@123");
		driver.findElement(By.cssSelector("input[value='1']")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Sign up')]")).click();
		
		//driver.findElement(By.cssSelector("#searchInput form-control    ")).sendKeys("gwyydg");
		//driver.close();
		
		/*driver.findElement(By.name("domainToCheck")).sendKeys("hqewef");
		Select sss=new Select(driver.findElement(By.id("header")));
		sss.selectByVisibleText("Domain name search");
		//driver.findElement(By.id("header")).click();*/
	}
}
