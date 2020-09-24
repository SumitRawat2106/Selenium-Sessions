package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement wb = driver.findElement(By.name("upfile"));
		Thread.sleep(2000);
		wb.sendKeys("C:\\Users\\Thinksysuser\\Downloads\\Today.jpg");   // type = file 
		
		
		
		
	}

}
