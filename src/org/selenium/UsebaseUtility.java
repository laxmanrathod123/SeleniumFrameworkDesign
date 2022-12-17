package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.qa.utilities.BaseUtility;

public class UsebaseUtility {

	public static void main(String[] args) {
		BaseUtility obj= new BaseUtility();
		WebDriver driver=obj.BrowserMethod("ch", "https://www.google.co.in/");
        WebElement Searchfield=driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        Searchfield.sendKeys("Automation Test Engineer");
	}

}
