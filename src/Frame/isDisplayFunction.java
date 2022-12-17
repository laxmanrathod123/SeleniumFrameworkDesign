package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class isDisplayFunction {

	public static void main(String[] args) {


		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://jqueryui.com/");
        driver.findElement(By.linkText("Toggle")).click();
        
        // switching the frame 
        // isDisplayed
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement toggleHeading = driver.findElement(By.xpath("//div[@id='effect']/h3"));
        String textofToggleHeading=toggleHeading.getText();
        System.out.println("textofToggleHeading= "+textofToggleHeading);
        Assert.assertTrue(toggleHeading.isDisplayed());
        System.out.println("Display Status :"+toggleHeading.isDisplayed());
        
        // isEnable means is clickable or not
        
        driver.switchTo().parentFrame();
      WebElement enableEle=  driver.findElement(By.linkText("Resizable"));
      System.out.println("isEnable :"+enableEle.isEnabled());
        driver.quit();
	}

}
