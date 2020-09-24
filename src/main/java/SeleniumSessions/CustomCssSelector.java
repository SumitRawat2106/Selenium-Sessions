package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Actions action  = new Actions(driver);
		
		
		//id : #{attribute value}
		// #username 
		// input#username 
		//  input[id = 'username']
		//  input[id = 'username'][type = 'email']
		
		
		//class : .{classname}
	   // .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		
		// text : 
	//  input[id^='username'] -- starting with text
	//  input[id$='username'] -- ending with text
		
		//  input[id*='username'] -- contains 
		
		// div>input[id= 'username'] --- parent child relationship
		
	}

}
