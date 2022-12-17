package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program start");
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(2000);
	}

}

