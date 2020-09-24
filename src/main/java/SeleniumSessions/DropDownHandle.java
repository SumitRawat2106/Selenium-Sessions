package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement day =  driver.findElement(By.id("day"));
		WebElement month =  driver.findElement(By.id("month"));
		WebElement year =  driver.findElement(By.id("year"));
		
	    //	Select select1  =  new Select(day);
		//	select1.selectByVisibleText("20");
		// select1.selectByIndex(10);
		//	Select select2  =  new Select(month);
		//	select2.selectByVisibleText("Jan");
		//	Select select3  =  new Select(year);
		//	select3.selectByVisibleText("1994");
		
		selectValuefromDropdown(day, "5");
		selectValuefromDropdown(month, "Jan");
		selectValuefromDropdown(year, "1994");
	}
	/**
	 * This method is used to select value from drop down on basis of given text 
	 * @param element
	 * @param value
	 */
	
	public static void selectValuefromDropdown(WebElement element , String value) {
		
		Select select =  new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	

}
