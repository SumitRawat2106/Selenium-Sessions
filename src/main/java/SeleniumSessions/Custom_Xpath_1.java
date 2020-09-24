package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// htmltag[@attribute = 'value']
		//input[@id = 'username' ]
		
		
		
		// htmltag[@attribute1 = 'value' and @attribute2 = 'value']
		//input[@id = 'username' and @type = 'email']
		
		//input[@class = 'form-control private-form__control login-email' ]
		
		//contains() in Xpath : 
		//htmltag[contains(@attibute , 'value')]
		
		//input[contains(@class , 'login-email')]
		//input[contains(@id , 'username')]
		
		//input[@id = 'username' and contains(@class , 'login-email')]
		
		//contains() used for dynamic id : 
		// <input id = 'test_123'>
		// <input id = 'test_223'>
		// <input id = 'test_323'>
		
		//input[contains(@id , 'test_')]
		
		// (//input[contains(@class , 'form-control')])[1]
		// (//input[contains(@class , 'form-control')])[2]
		
//		(//input[contains(@class , 'form-control')])[position()=1]
//		(//input[contains(@class , 'form-control')])[position()=2]
		
//		(//input[contains(@class , 'form-control')])[last()]	
//		(//i18n-string)[1]
		
		//text() in xpath :
		//htmltag[text() = 'value']
		
//		//i18n-string[text() ='Forgot my password']
		
		//span[text() ='Show Password']
		
		//span[contains(text() ,'Show Password')]
		
		//span[starts-with(text(), 'sumit')]
		//span[starts-with(@class, 'account')]
		
		
		//*[@id = 'username' ]
		
		//div//input  -- direct + indirect child 3
		//div/input   -- direct child 2
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
