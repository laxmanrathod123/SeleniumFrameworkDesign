package MouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaveenDragAndDrop {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        
        Actions action= new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"))).
        moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).
        release().build().perform();
        
        Thread.sleep(5000);
        
        
        
        
        driver.quit();
        System.out.println("Program  end");
	}

}
