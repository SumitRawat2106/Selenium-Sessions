package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Actions action  = new Actions(driver);
		selectcontact (driver ,action , "naveen k" );
	//	action.sendKeys(wb1, "test@gmail.com").build().perform();
		//action.sendKeys(wb2, "test123").build().perform();
	//	action.click(wb3).build().perform();
		
		
		// Two types of Xpath :
		//	1. Absolute Xpath : //html//div//div[1]//div[2]//span  - id
		//  2. Relative Xpath or Custom Xpath :   //span[@id ='test']
		
		
		// XPath Axes : 
		
		//div[@class='input-group']//following::input[@name='username']
		
		//div[@class='input-group']//following::input)[1]
		
		//div[@class='input-group']//preceding::input
		
		//input[@name='username']//parent::div
		//div[@class='input-group']//child::input
		
		//span[text()= 'naveen k']//ancestor::td//preceding-sibling::td//input
		
		
		// Reversing Xpath : traversing from child parent to parent to grand parent
		
		//input[@id = 'username']/../../..
		
		
		
		
		
		
		
		
			

	}
	
	public static void selectcontact (WebDriver driver , Actions action , String contactname) {
		
		WebElement wb = driver.findElement(By.xpath("//span[text()= '"+contactname+"']//ancestor::td//preceding-sibling::td//input"));
		action.click(wb).build().perform();
		
		
		
	}

}
