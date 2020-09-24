package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	public static void main(String[] args) {
		
		// Explicit wait : 
		//1. WebDriverwait 
		//2. FluentWait
		//a. Timeout   b.pollingPeriod  c.ignoringexception   d. wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		final By username =  By.name("username");
		By password =  By.name("password");
		By LoginBtn =  By.xpath("//input[@value = 'Login']");
		
		waitforElementwithFluentWait(driver , username).sendKeys("test@testxp.com");
		driver.findElement(password).sendKeys("test100");
		driver.findElement(LoginBtn).click();
	}

	public static WebElement waitforElementwithFluentWait(WebDriver driver , final By Locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement wb = wait.until(new Function<WebDriver , WebElement>(){

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(Locator);
			}
			
		});		
		return wb;	
		
	}
		
		
		
	
		
	}


