package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@role='button' and @ class='_42ft _4jy0 _6lti"
        		+ " _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(3000);
        // identifying the element
        WebElement monthdropdown=driver.findElement(By.id("month"));
        System.out.println("monthdropdown is enable :"+monthdropdown.isEnabled());
        
       
        Select select= new Select(monthdropdown);
        // select by Index
        select.selectByIndex(4);
        Thread.sleep(3000);
        
        // select byvalue
        select.selectByValue("3");
        Thread.sleep(3000);  
        // select by visible text
        
        select.selectByVisibleText("Nov");
        
        // getOption
        
       List <WebElement> monthvalue= select.getOptions(); 
       for(WebElement monthlist : monthvalue) {
    	   String list=monthlist.getText();
    	   System.out.println(list);
       }
        
        Thread.sleep(3000);
        driver.quit();
        System.out.println("program end");
	}

}
