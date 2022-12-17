package MouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehourAction {

	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.ebay.com/");
        
        WebElement ele=driver.findElement(By.linkText("Fashion"));
     
        Actions act=new Actions (driver);
        act.moveToElement(ele).perform();
        Thread.sleep(9000);
    
        driver.quit();
        System.out.println("Program  end");
	}
}
