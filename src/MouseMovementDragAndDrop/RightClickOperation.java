package MouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {

	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://demoqa.com/buttons");
     
        Thread.sleep(2000);
        
     WebElement button=   driver.findElement(By.id("rightClickBtn"));
     
     // 1. To perform the Right click operation
        Actions action= new Actions(driver);
        action.contextClick(button).perform();  // contextClick method perfomr the right click operation
        Thread.sleep(8000);
        
    // 2. To perform the Double click operation 
        WebElement butto1=   driver.findElement(By.id("doubleClickBtn"));
        Actions action1= new Actions(driver);
        action1.doubleClick().perform();
        Thread.sleep(9000);
        driver.quit();
        System.out.println("Program  end");
	}
}
