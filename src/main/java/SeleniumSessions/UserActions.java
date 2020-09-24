package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		By locator1 = By.id("username");
		By locator2 = By.id("password");
		By locator3 = By.id("loginBtn");
		// WebElement wb1 = driver.findElement(By.id("username"));
		//WebElement wb2 = driver.findElement(By.id("password"));
		//WebElement wb3 = driver.findElement(By.id("loginBtn"));
		//Actions action  = new Actions(driver);
		//action.sendKeys(wb1, "test@gmail.com").build().perform();
		//action.sendKeys(wb2, "test123").build().perform();
		//action.click(wb3).build().perform();
		Util u = new Util(driver);
		u.doActionSendKeys(locator1, "test@gmail.com");
		u.doActionSendKeys(locator2, "test123");
		u.doActionclick(locator3);

	}

}
