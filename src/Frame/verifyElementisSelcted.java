package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyElementisSelcted {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@role='button' and @ class='_42ft _4jy0 _6lti"
        		+ " _4jy6 _4jy2 selected _51sy']")).click();
        
        Thread.sleep(3000);
        
       WebElement radioBtn=driver.findElement(By.xpath("//input[@type='radio' and @ value='1']"));
       System.out.println("Female radio button status :"+radioBtn.isSelected());
       Assert.assertFalse(radioBtn.isSelected());
       
       radioBtn.click();
       System.out.println("Female radio button status :"+radioBtn.isSelected());
       Assert.assertTrue(radioBtn.isSelected());
       
       Thread.sleep(3000);
       driver.quit();
       System.out.println("program end");
	}

}
