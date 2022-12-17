package MouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionElement {

	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        
        WebElement sourceElement=driver.findElement(By.id("box6"));
        WebElement TargetElement=driver.findElement(By.id("box106"));
     
       Actions act= new Actions(driver);
       act.dragAndDrop(sourceElement, TargetElement).perform();
       Thread.sleep(6000);
        driver.quit();
        System.out.println("Program  end");
	}
}
