package MouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragableOperation {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        WebElement dragable= driver.findElement(By.linkText("Draggable"));
        dragable.click();
        
        driver.switchTo().frame(0);
        Actions action = new Actions (driver);
        WebElement dg=driver.findElement(By.id("draggable"));
        action.dragAndDropBy(dg, 110, 120).build().perform();
        Thread.sleep(9000);
		//droppable
        driver.switchTo().defaultContent();
       driver.findElement(By.linkText("Droppable")).click();
        WebElement target=driver.findElement(By.id("droppable"));
       action.dragAndDrop(dg, target).build().perform();
        Thread.sleep(9000);
        driver.quit();
        System.out.println("Program  end");
	}

}
