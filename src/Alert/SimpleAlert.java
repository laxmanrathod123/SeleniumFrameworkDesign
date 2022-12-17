package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		System.out.println("path:"+projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//simple Alert
		/*
		 * driver.findElement(By.id("alertBox")).click(); Alert
		 * simpleAlert=driver.switchTo().alert();
		 * System.out.println("Alert text="+simpleAlert.getText()); Thread.sleep(2000);
		 * simpleAlert.accept();
		 */
		//confirmation Alert
		/*
		 * driver.findElement(By.id("confirmBox")).click(); Alert
		 * confirmationAlert=driver.switchTo().alert();
		 * System.out.println("Alert text:"+confirmationAlert.getText());
		 * //confirmationAlert.accept(); confirmationAlert.dismiss();
		 * Thread.sleep(2000);
		 * System.out.println(driver.findElement(By.id("output")).getText());
		 */
		//*************************
		//Prompt Alert
				driver.findElement(By.id("promptBox")).click();
				Alert PromptAlert=driver.switchTo().alert();
				System.out.println("Alert text:"+PromptAlert.getText());
				//confirmationAlert.accept();
				
				PromptAlert.sendKeys("Lucky");
				PromptAlert.accept();
				//Thread.sleep(2000);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.close();
		
		
		
		
		
		

	}

}
