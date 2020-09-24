package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By emailID = By.id("username");
		By password = By.id("password");
		By LoginButton = By.id("loginBtn");

		waitForElement(driver ,emailID , 6).sendKeys("test@testxp.com");
		driver.findElement(password).sendKeys("test100");
		driver.findElement(LoginButton).click();
	}
	
	public  static WebElement waitForElement(WebDriver driver , By Locator , int timeout) {
		WebElement wb  = null ;
		for (int i = 0 ; i<timeout ; i++) {
			try {
				wb = driver.findElement(Locator);
				break;
			}
			catch(Exception e){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
			}
			
			
		}
		return wb;
		
		
		
		
	}

}
