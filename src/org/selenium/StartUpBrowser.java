package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartUpBrowser {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
	public void StartDriver(String browserName,String url)
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
	
	}

	public static void main(String[] args) {
		
		StartUpBrowser obj= new StartUpBrowser();
		obj.StartDriver("ch","https://www.google.co.in/");
	}

}
