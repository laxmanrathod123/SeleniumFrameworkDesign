package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreaddotSleep {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.google.co.in/");
        //selenium-webdriver
      driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium-webdriver");  
        Thread.sleep(000);
        driver.findElement(By.xpath("//li[@role='presentation'][2]")).click();
        driver.quit();
        
        System.out.println("Program end");
        ////li[@role='presentation'][2]
        ////input[@name='q']
	}

}
