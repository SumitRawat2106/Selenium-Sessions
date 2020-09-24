package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropdownValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement day =  driver.findElement(By.id("day"));
		WebElement month =  driver.findElement(By.id("month"));
		WebElement year =  driver.findElement(By.id("year"));
		
	    //	Select select =  new Select(day);
		//	
		//	List<WebElement> wb = select.getOptions();
		//	System.out.println(wb.size());
		//	for (int i = 1 ; i<wb.size() ; i++) {
		//	System.out.println(wb.get(i).getText());
		
		getDropdownValues(day);
		getDropdownValues(month);
		getDropdownValues(year);
		}
		
/**
 * This method is used to get values from dropdown 	
 * @param element
 */
	
public static ArrayList<String> getDropdownValues(WebElement element) {
	ArrayList<String> ar = new ArrayList<String>();
		
	Select select =  new Select(element);
	
	List<WebElement> wb = select.getOptions();
	System.out.println(wb.size());
	for (int i = 0 ; i<wb.size() ; i++) {
		ar.add(wb.get(i).getText());
		//System.out.println(wb.get(i).getText());
	}
	
	return ar;
		
	}
	

}
