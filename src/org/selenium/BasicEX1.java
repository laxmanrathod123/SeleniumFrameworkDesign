package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicEX1 {

	public static void main(String[] args) {  
		System.out.println("Program start ");
		String projectpath=System.getProperty("user.dir");
		System.out.println("path:"+projectpath);
		//System.setProperty("webdriver.chrome.driver", projectpath+
		//		"\\drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Project set up\\Workspace\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hellow Laxman");
		System.out.println("Program end ");
		// get method will hit the url and wait till the page load
		// defalut waiting time for the get method 30 second
		
		//"E:\Project set up\Workspace\Selenium_Project\drivers\chromedriver.exe"

	}

}
