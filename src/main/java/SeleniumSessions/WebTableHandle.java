package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int rowcount = driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size() - 1;
		System.out.println(rowcount);
		
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		for (int i = 2 ; i<=rowcount+1 ; i++ ) {
			String actualxpath = beforexpath +i+ afterxpath;
			String Text = driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(Text);
			
		}
		
		
		
		
		
		

	}

}
