package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://classic.freecrm.com/index.html");
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Laxman123");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Laxman123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(5000);
        
        driver.switchTo().frame("mainpanel");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Program  end");
        
        
	}

}
