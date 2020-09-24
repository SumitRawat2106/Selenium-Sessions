package SeleniumSessions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhotoUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("//input[@type = 'file']"));
		Thread.sleep(2000);
		wb.click();
//		uploadFile("C:\\Users\\Thinksysuser\\Downloads\\Today.jpg");
//		Thread.sleep(2000);
//
	}
}
//	public static void setClipboardData(String string) {
//		//StringSelection is a class that can be used for copy and paste operations.
//		   StringSelection stringSelection = new StringSelection(string);
//		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		}
//	
//	public static void uploadFile(String fileLocation) {
//        try {
//        	//Setting clipboard with file location
//            setClipboardData(fileLocation);
//            //native key strokes for CTRL, V and ENTER keys
//            Robot robot = new Robot();
//	
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//        } catch (Exception exp) {
//        	exp.printStackTrace();
//        }
//    }
//
//}
