package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.selenium.dev/");
        
        driver.findElement(By.xpath("//span[text()='Documentation']")).click();
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//*[@id=\"m-documentationwebdriver\"]/span")).click();
       Thread.sleep(5000);
        driver.quit();
        System.out.println("Program  end");
        
        
	}

}
