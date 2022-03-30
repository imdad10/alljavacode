package introduction;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class blockpopups {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions  opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking","enable-automation"));
		
		//enable-automation:  it enables the automatic control of chromedriver by selenium 
		//disable-popup-blocking:  it disable the auto popup
		
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.naukri.com");
		
		
	}

	

}
