package LauchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchBrowser2 {
	
	public static void main(String []args) {
		WebDriver driver;
		//int number=2;
		String browsername="chrome";
		switch(browsername) {
				case "chrome" : System.out.println("Program start");
					            System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
								+ "\\Selenium_Project\\drivers\\chromedriver.exe");
								driver= new ChromeDriver();
								driver.get("https://www.google.co.in/");
								System.out.println("program end");
								break;
		
				case "firefox": System.out.println("Program start");
							    System.setProperty("webdriver.gecko.driver", "E:\\Project set up\\Workspace\\Selenium_Project"
								+ "\\drivers\\geckodriver.exe");
						
								driver= new FirefoxDriver();
								driver.get("https://www.google.co.in/");
								System.out.println("program end");
								break;
						
			      default     :System.out.println("Invalid Input");
			                   break;
		
		}
		
		
	}

}
