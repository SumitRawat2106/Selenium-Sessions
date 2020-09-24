package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver ;
	
	public Util(WebDriver driver) {
		this.driver = driver ;
		
	}
	
	/**
	 * 
	 * This method is used to create the webElement on the basis of locator 
	 * @return
	 */

	
	public WebElement getElement(By Locator) {
		WebElement element = null ; 
		try {
		element = driver.findElement(Locator); 
		}
		catch(Exception e) {
			System.out.println("Some exception occured while creating web element...");
			System.out.println(e.getMessage());
			
		}
		return element ;
	}
	
	
	/**
	 *  This method is used to click the webElement on the basis of locator
	 * @param Locator
	 */
	public void doClick(By Locator) {
		try {
		getElement(Locator).click();
		}
		catch(Exception e) {
			System.out.println("Some exception occured while clicking web element...");
			System.out.println(e.getMessage());
			
		}
	}
	
	
	
	/**
	 *  This method is used to enter text in  webElement on the basis of locator
	 * @param Locator
	 */
	
	public void doSendKeys(By Locator , String value  ) {
		try {
			
			getElement(Locator).sendKeys(value);
		}
		catch(Exception e) {
			System.out.println("Some exception occured while passing value to webelement...");
			System.out.println(e.getMessage());
			
		}
	}
	
	
	/**
	 *  This method is used to enter text in  webElement using actions class
	 * @param Locator
	 */
	
	public void doActionSendKeys(By Locator , String value) {
		Actions action = new Actions(driver);
		WebElement wb = getElement(Locator);
		action.sendKeys(wb, value).perform();
	}
	
	/**
	 *  This method is used to enter click  webElement using actions class
	 * @param Locator
	 */
	
	public void doActionclick(By Locator) {
		Actions action = new Actions(driver);
		WebElement wb = getElement(Locator);
		action.click(wb).perform();
	}
		
	
	
		
		/**
		 *  This method is used to wait for web element
		 * @param Locator
		 */
		
		public void waitforelementpresent(By Locator , int timeout ) {
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Locator));
	}
		
		
		
		
		public void waitforelementTobeclickable(By Locator , int timeout ) {
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
		
		public WebElement waitforelementTobevisible(By Locator , int timeout ) {
			WebElement wb = getElement(Locator);
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.visibilityOf(wb));
			   return wb;
	}
		
		public WebElement waitforelementvisibilitylocated(By Locator , int timeout ) {
		
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
			   return getElement(Locator);
	}

		

		public boolean waitAlerttobePresent(int timeout ) {
		
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.alertIsPresent());
			   return true;
	}
		
		public void clickwhenready(By Locator , int timeout ) {
			
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.elementToBeClickable(Locator));
		      getElement(Locator).click();
			
		}

		
		/**
		 *  This method is used to wait for title
		 * @param Locator
		 */
		
		public String waitfortitle( int timeout , String title  ) {
			WebDriverWait wait = new WebDriverWait(driver ,timeout);
			   wait.until(ExpectedConditions.titleContains(title));
			   return driver.getTitle();
	}
}
