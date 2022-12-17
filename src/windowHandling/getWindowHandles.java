package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver", "E:\\Project set up\\Workspace"
				+ "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver(); 
        driver.get("https://demo.automationtesting.in/Windows.html");
        
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        
        Set <String>allwinid=driver.getWindowHandles();
        Iterator <String>itr=allwinid.iterator();
       String mainwindow= itr.next();
       String nextwindow=itr.next();
       
       driver.switchTo().window(nextwindow);
       WebElement ele=driver.findElement(By.xpath("//*[@id=\"td-cover-block-0\"]/div/div/div/div/h1"));
        String nameofele=ele.getText();
        System.out.println("Name of the element : "+nameofele);
        driver.close();
       
        driver.switchTo().window(mainwindow);
        WebElement mainpageele=driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
        System.out.println("Text on main page element :"+mainpageele.getText());
        
        driver.quit();
        System.out.println("program end");
	}

}
