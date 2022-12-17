package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HadleAlert {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Project set up\\Workspace" + "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();

		driver.findElement(By.id("login1")).sendKeys("laxmanrathod123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("// input[@name='proceed']")).click();
		
		// if bydefault our alert is coming late then we can apply explicitwait
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		String alertText = alt.getText();
		System.out.println("alertText: " + alertText);
		alt.accept();
		driver.findElement(By.id("password")).sendKeys("Rathod123");

		driver.quit();
		System.out.println("Program  end");
	}

}
