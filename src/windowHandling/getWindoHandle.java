package windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindoHandle {

	public static void main(String[] args) {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.facebook.com/");
      
       String mainwindow=driver.getWindowHandle();
       System.out.println("id of main window :"+mainwindow);
        
       driver.findElement(By.linkText("Forgotten password?")).click();
      String forgottenwindoid= driver.getWindowHandle();
      System.out.println("id of forgottenwindoid window :"+forgottenwindoid);
        driver.quit();
        System.out.println("program end");
	}

}
