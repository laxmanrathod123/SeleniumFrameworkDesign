package MouseMovementDragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class mouseHover {

	private static final String DurationOf = null;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Project set up\\Workspace" + "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americangolf.eu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//*[@id=\"termly-code-snippet-support\"]/div/div/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		WebElement clothing= driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[3]/a"));
		Actions action= new Actions(driver);
		action.moveToElement(clothing).build().perform();
		
      
		
		WebElement trousertitle=driver.findElement(By.xpath("//*[@id=\"CLOTHFOOTW_1\"]/ul/li[3]/ul/li[1]/a/span"));
		trousertitle.click();
		
		Thread.sleep(2000);
		
		String actualTitle=driver.getTitle();
		System.out.println("actualTitle:"+actualTitle);
		Assert.assertEquals("Golf Trousers | Golf Pants | American Golf",actualTitle );
		Thread.sleep(9000);
	    
		driver.quit();
		System.out.println("Program  end");
		
	}

}
