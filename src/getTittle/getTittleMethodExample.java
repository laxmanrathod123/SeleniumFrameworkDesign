package getTittle;

import org.openqa.selenium.WebDriver;

import LauchBrowser.BaseUtility;

public class getTittleMethodExample {

	public static void main(String[] args) {

		BaseUtility obj= new BaseUtility();
		WebDriver driver=obj.StartUp("chrome","https://www.google.co.in/");
		String tittle=driver.getTitle();
		System.out.println("Tittle of the google page:"+tittle);
		
		if(tittle.equals("Google")) {
			System.out.println("Tiitle of the google page is correct");
		}else {
			System.out.println("Tiitle of the google page is not correct");
		}
		
		//String pagesource=driver.getPageSource();
		//System.out.println("Printing the pagesource :"+pagesource);
		driver.quit();
				
	}

}
