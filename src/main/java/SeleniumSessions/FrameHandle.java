package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		WebElement wb = driver.findElement(By.name("main"));
		//driver.switchTo().frame(wb);
		driver.switchTo().frame("main");
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();  //This method is used to return to default web page from Frame
		// driver.switchTo().parentFrame()
		

	}

}
