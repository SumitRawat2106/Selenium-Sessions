package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLoginPageImplicitlywait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
	    //applied for all the elements
		// Global wait
		//Dynamic wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("dsfasdfsdafsdfsdafsa");
		driver.findElement(By.id("loginBtn")).click();

	}

}
