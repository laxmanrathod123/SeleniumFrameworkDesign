package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program  started");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Project set up\\Workspace" + "\\Selenium_Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools." + "com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.switchTo().frame("iframeResult");
		WebElement multiple = driver.findElement(By.id("cars"));
		Select select = new Select(multiple);

		// check the dropdown is multiple or not
		System.out.println("Dropdown is multiselect :" + select.isMultiple());
		// we can perform the operation on it
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);

		// getFirstSelected option

		System.out.println(select.getFirstSelectedOption().getText());

		System.out.println("***************");
		// getAllSelected option
		List<WebElement> selectoption = select.getAllSelectedOptions();
		for (WebElement webElement : selectoption) {

			System.out.println(webElement.getText());

		}
		Thread.sleep(2000);
		select.deselectAll();
		
		driver.quit();
		System.out.println("program end");
	}

}
