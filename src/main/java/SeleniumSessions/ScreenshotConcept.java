package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		// File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(SrcFile , new File("./target/screenshot/page.png"));
		
		takescreenshot(driver,"LoginPage");
	}
	
	public static void takescreenshot(WebDriver driver , String FileName) {
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile , new File("./target/screenshot/" + FileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
