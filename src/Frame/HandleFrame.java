package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://jqueryui.com/");
       driver.findElement(By.linkText("Button")).click();
       
       // veryfying the page title
     WebElement pagetitle=  driver.findElement(By.className("entry-title"));
      Assert.assertEquals(pagetitle.getText(), "Button");
      
      // working inside the frame
      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
     WebElement frstBtn= driver.findElement(By.xpath("//*[@class='widget']/button"));
     Assert.assertEquals(frstBtn.getText(), "A button element");
       
        // switching to the parent frame before performing the next  operation to the next frame
        driver.switchTo().parentFrame();
        WebElement exampleElement=driver.findElement(By.xpath("//*[@id='content']/div[1]/h2"));
        Assert.assertEquals(exampleElement.getText(), "Examples");
        
        driver.quit();
        System.out.println("program end");
	}

}
