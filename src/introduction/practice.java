package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    WebElement down=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop=new Select(down);
		drop.selectByIndex(3);
		String tt=drop.getFirstSelectedOption().getText();
		System.out.println(tt);
		Thread.sleep(3000);
		drop.selectByVisibleText("INR");
		drop.getFirstSelectedOption().getText();
		drop.selectByValue("AED");
		String ss=drop.getFirstSelectedOption().getText();
		System.out.println(ss);
	}

}
