package MouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEX1 {

	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.spicejet.com/");
        
        Thread.sleep(2000);
        Actions action= new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("https://www.spicejet.com/"))).build().perform();
        
        
        driver.quit();
        System.out.println("Program  end");
	}
}
