package HandlingOfDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicEx1 {
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		System.out.println("Program Start");
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",Projectpath+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Projectpath);
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement dropdown=driver.findElement(By.id("option"));
		
		// for deselecting the the dropdown
		//WebElement dropdown1=driver.findElement(By.id("owc"));
		Select select =new Select(dropdown);
		WebElement firstoption=select.getFirstSelectedOption();
		System.out.println("FirstOption:"+firstoption.getText());
		
		List<WebElement>alldropdown=select.getOptions();
		 for(WebElement ele:alldropdown) {
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("option 2"))
				ele.click();
			Thread.sleep(2000);
		}
		
		/*
		 * List<WebElement>allopt=driver.findElements(By.id("option")); //This is the
		 * another way of listing dropdown for(WebElement ele1: allopt) {
		 * System.out.println(ele1.getText());
		 * if(ele1.getText().equalsIgnoreCase("option 2")) ele1.click();
		 * Thread.sleep(2000); }
		 */	
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		select.selectByValue("option 2");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Option 3");
		//select.deselectByVisibleText("Option 3");
		Thread.sleep(2000);
		
		System.out.println("Program End");
		driver.quit();
		System.out.println("Done");
	}
}
		
	


