package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		
		
		
		//driver.findElement(By.cssSelector("button[class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		//driver.findElement(By.cssSelector("div[aria-label='Sun Dec 26 2021'] div[class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top']")).click();
		
		WebElement ss=driver.findElement(By.xpath("//div[@class='mb-4']//select[@class='bc-neutral-100 bg-transparent']"));
	    Select dom=new Select(ss);
	    dom.selectByIndex(4);
	    
	  WebElement kk= driver.findElement(By.xpath("//div[3]//select[1]"));
	  Select kop= new Select(kk);
	  kop.selectByIndex(2);
	  
	  driver.findElement(By.xpath("//strong[@class='pr-1']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indi");
	  Thread.sleep(3000);
	 List<WebElement>  hop= driver.findElements(By.xpath("//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-1 z-50 l-0' and @style='left: 0px; box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px 0px; min-width: 250px;'] //li"));
	
	  for(WebElement pop:hop) {
		  try {
		  if(pop.getText().equalsIgnoreCase("Air India (AI)")) {
			  pop.click();
			  break;
			 
		  }}
		  catch(Exception e) {
			 System.out.println(e.getMessage());
			 
		  }
		  }
	  
	  Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")).click();
	 String text =driver.findElement(By.xpath("//span[contains(text(),'Select Departure and Arrival airports/cities.')]")).getText();
	 System.out.println(text);

	
	}

}
