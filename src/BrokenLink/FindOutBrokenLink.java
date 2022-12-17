package BrokenLink;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOutBrokenLink {

	public static void main(String[] args) throws IOException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
		  
        driver.get("https://edition.cnn.com/");
        
        // Apply implicite wait
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
       List<WebElement>links= driver.findElements(By.tagName("a"));
       System.out.println("Number of linkds are prsent onf the page:"+links.size());
       
       for(WebElement link:links)
       {
    	 //String linkonpage=  link.getText();
    	 //System.out.println("Link present on the page :"+linkonpage);
    	   String URL=link.getAttribute("href");
    	   GetLinkStatus.verifyLink(URL);
       }
       System.out.println("Total number of broken link:");
       GetLinkStatus.getInvalidLinkCount();
       driver.quit();
        System.out.println("Program end");
	}

}
