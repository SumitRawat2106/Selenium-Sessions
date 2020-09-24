package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		JavaScriptUtil.getTitleByJS(driver);
		// JavaScriptUtil.generateAlertbyJS(driver, "This is a good site.");
		// JavaScriptUtil.refreshBrowserbyJS(driver);
		// System.out.println(JavaScriptUtil.getBrowserInfobyJS(driver));
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "test@gmail.com");
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "password", "test1000xxccvxcv");
		Thread.sleep(5000);
		WebElement wb = driver.findElement(By.id("loginBtn"));
		// wb.click();
		JavaScriptUtil.clickElementByJS(wb, driver);
		
		
		
	}

}
