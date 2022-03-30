package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calenderui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(8))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DayPicker-Caption")));

		// driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[text()='January
		// 2022']"));

		// driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//span[@aria-label='Next
		// Month']")).click();
		ClickOnNext(driver, "12", "2023", "December");
		prevmonthyear(driver, "22", "2022", "May");
	}

	public static String[] nextmonthyear(String str) {
		return str.split(" ");
	}

	public static void ClickOnNext(WebDriver driver, String nextday, String nextyear, String nextmonth) {
		String str = driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
		System.out.println(str);
		while (!(nextmonthyear(str)[0].equals(nextmonth) && nextmonthyear(str)[1].equals(nextyear))) {

			driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
			str = driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
			// driver.findElement(By.xpath("//div[text()='"+nextday+"']")).click();
		}

		driver.findElement(By.xpath("//div[text()='" + nextday + "']")).click();
		
		//driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();

	}
	
	public static void prevmonthyear(WebDriver driver, String preday, String preyear, String premonth) {
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		String str = driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
		System.out.println(str);
		while (!(nextmonthyear(str)[0].equals(premonth) && nextmonthyear(str)[1].equals(preyear))) {

			driver.findElement(By.cssSelector("span[aria-label='Previous Month']")).click();
			str = driver.findElement(By.cssSelector(".DayPicker-Caption")).getText();
			// driver.findElement(By.xpath("//div[text()='"+nextday+"']")).click();
		}

		driver.findElement(By.xpath("//div[text()='" + preday + "']")).click();
	
	}
}
