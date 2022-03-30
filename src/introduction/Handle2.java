package introduction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//img[contains(alt,'LinkedIn OrangeHRM group')]
		//img[contains(alt,'OrangeHRM on Facebook')]
		//img[contains(alt,'OrangeHRM on twitter')]
		//img[contains(alt,'OrangeHRM on youtube')]
		driver.findElement(By.xpath("//a/img[@alt='LinkedIn OrangeHRM group']"));
		driver.findElement(By.xpath("//a/img[@alt='OrangeHRM on Facebook']"));
	    driver.findElement(By.xpath("//a/img[@alt='OrangeHRM on twitter']"));
		driver.findElement(By.xpath("//a/img[@alt='OrangeHRM on youtube']"));
		
		Set<String> str=driver.getWindowHandles();
		List<String> lis=new ArrayList<String>(str);
		
		
	}
	

}
