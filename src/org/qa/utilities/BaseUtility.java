package org.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtility {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
	
	public WebDriver BrowserMethod(String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("ff")||browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void main(String[] args) {
		BaseUtility obj= new BaseUtility();
		obj.BrowserMethod("ch","https://www.google.co.in/");

	}

}
