package HandlingOfDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookEx {
     static WebDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		System.out.println("Program start");
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button'][@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		/*
		 * Select select= new Select(day); select.selectByVisibleText("1");
		 * Thread.sleep(2000);
		 * 
		 * Select select1= new Select(month); select1.selectByVisibleText("Jun");
		 * Thread.sleep(2000);
		 * 
		 * Select select2= new Select(year); select2.selectByVisibleText("1995");
		 * Thread.sleep(2000);
		 */
		String dob="1-Jun-1996";
		String dobarr[]=dob.split("-");
		
		//selectDropdownMethod(day,"6");
		selectDropdownMethod(day,dobarr[0]);
		Thread.sleep(2000);
		
		//selectDropdownMethod(month,"Jun");
		selectDropdownMethod(month,dobarr[1]);
		Thread.sleep(2000);
		
		//selectDropdownMethod(year,"1995");
		selectDropdownMethod(year,dobarr[2]);
		Thread.sleep(2000);
		driver.quit();
		
		System.out.println("Program end");
		
		
		
	}
	public static void selectDropdownMethod(WebElement element,String value) {
		Select select= new Select(element);
		select.selectByVisibleText(value);
	}
}
