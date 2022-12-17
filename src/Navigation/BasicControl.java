package Navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicControl {

	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		System.out.println("path:"+projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("Laxman");
		driver.findElement(By.id("lastName")).sendKeys("Rathod");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("abcddujb");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here to navigate to the home page"));
		
	}

}
