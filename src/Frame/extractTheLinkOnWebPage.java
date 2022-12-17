package Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class extractTheLinkOnWebPage {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://edition.cnn.com/");
        
     WebElement topstories=  driver.findElement(By.xpath("//*[@id=\"anim1664325067218c\"]"));
        List<WebElement> topStoriesLinks=(List<WebElement>) topstories.findElement(By.tagName("a"));
        System.out.println("Number of top stories on CNN are :"+topStoriesLinks);
        
        Thread.sleep(9000);
        driver.quit();
        System.out.println("program end");
	}

}
