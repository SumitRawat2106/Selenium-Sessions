package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithOutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		List<WebElement> wb = driver.findElements(By.xpath("//select[@id ='day']/option"));
		System.out.println(wb.size());
		for (int i = 0 ; i<wb.size(); i++) {
			String text = wb.get(i).getText();
			System.out.println(wb.get(i).getText());
			if (text.equals("25")) {
				wb.get(i).click();
				break;
			}
		}
		
		
		
		

	}

}
