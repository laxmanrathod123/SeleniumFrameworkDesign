package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LauchBrowser.BaseUtility;

public class NaveenExOnAlert {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Alert text is:"+alertText);
		
		if(alert.equals("You clicked a button")) {
			System.out.println("messasge is correct");
		}else {
			System.out.println("messasge is incorrect");
		}
		
		
		alert.accept();   // accept method will click on the pop up of the alert
		driver.quit();
		System.out.println("Program  Ended");
	}

}
