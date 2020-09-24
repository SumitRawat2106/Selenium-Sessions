package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles  = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentwindowID = it.next();
		System.out.println("Parent windowID is : " + ParentwindowID);
		String ChildwindowID = it.next();
		System.out.println("Child windowID is : " + ChildwindowID);
		driver.switchTo().window(ChildwindowID);
		System.out.println("Child window title is : " +driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentwindowID);
		System.out.println("Parent window title is : " +driver.getTitle());
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> handles1 =driver.getWindowHandles();
		Iterator<String> itr = handles1.iterator();
		String ParentwindowID1 = itr.next();
		System.out.println("Parent windowID is : " + ParentwindowID1);
		String ChildwindowID1 = itr.next();
		System.out.println("Child windowID is : " + ChildwindowID1);
		driver.switchTo().window(ChildwindowID1);
		System.out.println("Child window title is : " +driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentwindowID1);
		driver.quit();
		
		

	}

}
