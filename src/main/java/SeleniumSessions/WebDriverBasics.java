package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinksysuser\\Downloads\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       //1. Launch the browser
		driver.get("https://www.facebook.com");   //2. Enter url
		String title = driver.getTitle(); //3. Get the page title 
		System.out.println(title);
		
		//4. Validation point
		if (title.equals("Facebook – log in or sign up")) {
			System.out.println("This is correct title");
		}
		else {
			System.out.println("This is in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		
	//	driver.quit();  //This will make session Id as null
		//driver.close();  //This will make session Id invalid or expired
	
		

	}

}
