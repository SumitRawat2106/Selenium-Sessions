package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) throws InterruptedException {
		
   //  Map<String, String> usermap = new HashMap<String, String>();
		
	//	usermap.put("admin", "admin@gmail.com_test@123");
	//	usermap.put("patient", "tom@gmail.com_test@1234");
	//	usermap.put("doctor", "many@gmail.com_test@123456");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		// driver.findElement(By.id("username")).sendKeys(usermap.get("admin").split("_")[0]);
		// driver.findElement(By.id("password")).sendKeys(usermap.get("admin").split("_")[1]);
		
		dologin(driver ,getUserMap(), "admin" );

	}
	
	public static Map<String, String> getUserMap() {
       Map<String, String> usermap = new HashMap<String, String>();
		
		usermap.put("admin", "admin@gmail.com_test@123");
		usermap.put("patient", "tom@gmail.com_test@1234");
		usermap.put("doctor", "many@gmail.com_test@123456");
		
		return usermap;		
	}
	
	
	public static void dologin(WebDriver driver , Map<String, String> usermap ,String  userKey) {
		driver.findElement(By.id("username")).sendKeys(usermap.get(userKey).split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(usermap.get(userKey).split("_")[1]);
		
		}
		
	

}
