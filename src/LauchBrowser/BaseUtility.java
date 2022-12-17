package LauchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtility {
	
	WebDriver driver;
	
	
	public WebDriver StartUp(String browsername, String url) {
			      if(browsername=="chrome") {
				  System.out.println("Program of chrome is started");
				  System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				  + "\\Selenium_Project\\drivers\\chromedriver.exe");
				  driver= new ChromeDriver(); 
				  System.out.println("Program end");
		}else
		{
				 System.out.println("Program of firefox is started");
				 System.setProperty("webdriver.gecko.driver", "E:\\Project set up\\Workspace\\Selenium_Project"
						+ "\\drivers\\geckodriver.exe");
				
				 driver= new FirefoxDriver();
				
				 System.out.println("Program end");
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
}
