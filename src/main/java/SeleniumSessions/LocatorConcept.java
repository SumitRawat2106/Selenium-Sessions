package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinksysuser\\Downloads\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		// 1. id concept  :
		WebElement wb = driver.findElement(By.id("email"));
		wb.sendKeys("sumitrawat103@gmail.com");
		
		WebElement wb1 = driver.findElement(By.id("pass"));
		wb1.sendKeys("21061994");
		
		//WebElement wb2 = driver.findElement(By.id("u_0_b"));
		//wb2.click();  
		
		// 2. name concept  :
		// driver.findElement(By.name("email")).sendKeys("sumitrawat103@gmail.com");
		
		// 3. Xpath :
		//	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("sumitrawat103@gmail.com");
		//	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("21061994");
		
		
		//4. Css selector
		// driver.findElement(By.cssSelector("#email")).sendKeys("sumitrawat103@gmail.com");
		// driver.findElement(By.cssSelector("#pass")).sendKeys("21061994");
		
		//5. Class name
		// driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sumitrawat103@gmail.com");
		// driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("21061994");
		
		//6.link text : only used for links
		// driver.findElement(By.linkText("Create a Page")).click();
		
		//7. Partial link text : 
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
