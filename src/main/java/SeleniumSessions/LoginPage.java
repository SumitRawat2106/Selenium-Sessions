package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
	//	Thread.sleep(5000);
		
		//page object 
		By emailID = By.id("username");
		By password = By.id("password");
		By LoginButton = By.id("loginBtn");
		By Locator = By.linkText("Sign up");
		
		Util u = new Util(driver);
		u.clickwhenready(Locator, 10);
		// u.getElement(emailID).sendKeys("test@gmail.com");
	//	u.getElement(password).sendKeys("1234sdfsd");
	//	u.getElement(LoginButton).click();
	//	String title = u.waitfortitle(10, "HubSpot");
		//	System.out.println(title);
		//	u.waitforelementpresent(emailID, 20);
		//	u.doSendKeys(emailID, "test@tetsxp.com" );
		//	u.doSendKeys(password, "test@12344");
		//	u.doClick(LoginButton);
		
		
		
		

	}

}
