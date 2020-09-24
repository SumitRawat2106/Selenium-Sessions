package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowandColumnWebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int rowcount = driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size() - 1;
		System.out.println(rowcount);
		String xpath1 = "//*[@id=\"customers\"]/tbody/tr[";
		String xpath2 = "]/td[";
		String xpath3 = "]";
		
		for (int i = 2 ; i<=rowcount+1 ; i++ ) {
			for (int j = 1 ; j<=3 ; j++ ) {
			String actualxpath = xpath1 + i + xpath2 + j + xpath3 ; 
			String Text = driver.findElement(By.xpath(actualxpath)).getText();
			System.out.print(Text + "     ");
			
		}
			System.out.println();

	}

	}
}
