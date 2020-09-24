package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLoginPageExplicitlywait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://app.hubspot.com/login");
	    WebDriverWait wait1 = new WebDriverWait(driver ,20);
	    wait1.until(ExpectedConditions.titleContains("HubSpot"));
	    System.out.println(driver.getTitle());
	    
	   By emailID = By.id("username");
	   WebDriverWait wait = new WebDriverWait(driver ,20);
	  //  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(emailID));
	 // WebElement email = driver.findElement(emailID);
	   WebElement email1 = wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
	   email1.sendKeys("test@gmail.com");
	   
	}

}
