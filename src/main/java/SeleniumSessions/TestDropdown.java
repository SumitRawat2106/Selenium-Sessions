package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		/*WebElement day =  driver.findElement(By.id("day"));
		WebElement month =  driver.findElement(By.id("month"));
		WebElement year =  driver.findElement(By.id("year"));
		
		String DOB = "20-Jan-1995";
		String str[] = DOB.split("-");
		DropDownHandle.selectValuefromDropdown(day, str[0]);
		DropDownHandle.selectValuefromDropdown(month, str[1]);
		DropDownHandle.selectValuefromDropdown(year, str[2]);
		
		ArrayList<String> ar = GetDropdownValues.getDropdownValues(day);
		System.out.println(ar);
		driver.quit();**/
		String locator = "//select[@id ='day']/option"; 
		DropdownUtil.selectDropdownValuewithoutselect(driver, locator, "13");
		

	}

}
