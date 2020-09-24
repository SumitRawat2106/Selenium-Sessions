package SeleniumSessions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OurTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ourtime.com/v3/login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("sdfsad");
		driver.findElement(By.id("password")).sendKeys("sdfsad");
		driver.findElement(By.linkText("Click here"));
		Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(wb);
		driver.findElement(By.xpath("//span[@role= 'checkbox']//div[@class='recaptcha-checkbox-border']")).click();
		Thread.sleep(2000);
		
		
		driver.quit();
	//	Actions action  = new Actions(driver);
		//WebElement wb3 = driver.findElement(By.id("recaptcha-anchor"));
	//	action.click(wb3).build().perform();

		
//		WebElement wb = driver.findElement(By.id("ddlGenderCombined"));
//		Select sc = new Select(wb);
//		sc.selectByVisibleText("I'm a woman seeking women");
//		WebElement wb1 = driver.findElement(By.id("imgFreeBrowse"));
//		wb1.click();
//		Thread.sleep(10000);
//		WebElement wb2 = driver.findElement(By.xpath("//div[@id = 'ddlCountryItemCA']"));
//		wb2.click();
//		Thread.sleep(4000);
//		WebElement wb3 = driver.findElement(By.id("btnContinue"));
//		wb3.click();
//		WebElement wb4 = driver.findElement(By.id("txtPostalCode"));
//		wb4.clear();
//		Thread.sleep(2000);
//		wb4.sendKeys("A1A1A1");
//		Thread.sleep(4000);
//		WebElement wb5 = driver.findElement(By.id("btnContinue"));
//		wb5.click();
//		Thread.sleep(2000);
//		WebElement wb6 = driver.findElement(By.id("txtUsername"));
//		wb6.sendKeys("Tarun");
//		WebElement wb7 = driver.findElement(By.id("txtPassword"));
//		wb7.sendKeys("test100");
//		WebElement wb8 = driver.findElement(By.id("btnContinue"));
//		wb8.click();
//		Thread.sleep(2000);
//		WebElement wb9 = driver.findElement(By.id("ddlBirthMonth"));
//		Select sc1 = new Select(wb9);
//		sc1.selectByVisibleText("January");
//		WebElement wb10 = driver.findElement(By.id("ddlBirthDay"));
//		Select sc2 = new Select(wb10);
//		sc2.selectByVisibleText("21");
//		WebElement wb11 = driver.findElement(By.id("ddlBirthYear"));
//		Select sc3 = new Select(wb11);
//		sc3.selectByVisibleText("1994");
//		WebElement wb12 = driver.findElement(By.id("btnContinue"));
//		wb12.click();
//		WebElement wb13 = driver.findElement(By.id("txtEmailAddress"));
//		wb13.sendKeys("kind124@testxp.com");
//		WebElement wb14 = driver.findElement(By.id("btnContinue"));
//		wb14.click();
//		Thread.sleep(2000);
//	
//		WebElement wb15 = driver.findElement(By.xpath("//div[@id= 'NoPhotoView']/label[@class= 'uploadFromComputer']"));
//		Thread.sleep(1000);
//		wb15.click();
//		uploadFile("C:\\Users\\Thinksysuser\\Downloads\\Today.jpg");
//		Thread.sleep(2000);
//		
//	}
//	
//		public static void setClipboardData(String string) {
//			//StringSelection is a class that can be used for copy and paste operations.
//			   StringSelection stringSelection = new StringSelection(string);
//			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			}
		
		
		
		
		
		
		
		

	}


