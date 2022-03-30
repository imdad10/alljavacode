package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentrahul {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		Thread.sleep(3);
//		String ss=driver.findElement(By.xpath("//p[contains(text(),'You will be limited to only fewer functionalities ')]")).getText();
//		System.out.println(ss);
		
		//WebElement ele=driver.findElement(By.cssSelector("#okayBtn"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", ele);
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
	   
		//driver.findElement(By.cssSelector("#okayBtn")).click();
		
		
		 WebElement cli=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sel=new Select(cli);
		sel.selectByVisibleText("Consultant");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='terms']")).click();
		//driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		
	
	}

}
