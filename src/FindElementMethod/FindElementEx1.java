package FindElementMethod;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LauchBrowser.BaseUtility;

public class FindElementEx1 {
public static void main (String []args) {
	 
		BaseUtility obj= new BaseUtility();
		WebDriver driver=obj.StartUp("chrome","https://demoqa.com/webtables");
		List<WebElement>allFName=driver.findElements
				(By.xpath("//div[@class='rt-td'][text()][1]"));
		for(int i=0 ; i<allFName.size(); i++){
			System.out.println(allFName.get(i).getText()); 
		
			// print the list of webElement by using Iterator
			Iterator<WebElement>itr=allFName.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			// print the list of webElement by using Lambda Function
			
			allFName.stream().forEach(ele -> System.out.println(ele));
		
	}

}
}
