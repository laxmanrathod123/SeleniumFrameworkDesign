package Navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		System.out.println("path:"+projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("mvn Repository");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Laxman");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
