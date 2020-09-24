package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownUtil {
	
	public static void getDropdownValues(WebElement element) {
		
		Select select =  new Select(element);
		
		List<WebElement> wb = select.getOptions();
		System.out.println(wb.size());
		for (int i = 0 ; i<wb.size() ; i++) {
			System.out.println(wb.get(i).getText());
		}
	}
		
		public static void selectValuefromDropdown(WebElement element , String value) {
			
			Select select =  new Select(element);
			select.selectByVisibleText(value);
			
		}
		public static void selectDropdownValuewithoutselect(WebDriver driver  , String locator, String value ) {
		List<WebElement> wb = driver.findElements(By.xpath(locator));
		System.out.println(wb.size());
		for (int i = 0 ; i<wb.size(); i++) {
			String text = wb.get(i).getText();
			System.out.println(wb.get(i).getText());
			if (text.equals(value)) {
				wb.get(i).click();
				break;
			}
		}
		}
}

