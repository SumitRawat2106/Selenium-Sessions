package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickconcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//String text =  driver.findElement(By.xpath("//ul/li[contains(@class, 'context-menu-icon-cut')]/span")).getText();
		//System.out.println(text);
	

}
	
	public static void RightClickconceptgetvalue(WebDriver driver ,String Locator) {
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.className("context-menu-one"));
		action.contextClick(wb).build().perform();
	List<WebElement> li = driver.findElements(By.xpath(Locator));
	for(int i =0 ; i<li.size(); i++ ) {
		System.out.println(li.get(i).getText());
	}
		}
}
	
