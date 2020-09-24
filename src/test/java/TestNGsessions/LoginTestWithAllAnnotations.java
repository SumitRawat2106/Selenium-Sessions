package TestNGsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithAllAnnotations {
	
	//Before annotations : BS , BT , BC , BM 
	//Test annotations : @Test
	//After annotations : AM , AC , AT , AS
	
	/**
	 * BS
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * BM
	 * T2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 */
	
	WebDriver driver ;
	
	By email = By.id("email");
	By password = By.id("pass");
	By LoginButton  = By.xpath("//input[@type='submit']");
	By ForgottenaccountLink = By.linkText("Forgotten account?");
	By FBloogedinUsername = By.xpath("//div[text() = 'SuMit Nawdy Rawat']");
	
	
	@BeforeSuite() 
	public void beforesuite()
	{
		System.out.println("Before suite --- Prepare test data ");
		
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test --- DB connection ");
		
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class --- Get value from DB ");
	}
	
	
    @BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void ForgottenaccountLinkTest() {
		
		Assert.assertTrue(driver.findElement(ForgottenaccountLink).isDisplayed());	
		
	}
	
	@Test(priority=2 , enabled = false)
	public void pageTitleTest() {
		String ActualTitle =  driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, "Facebook – log in or sign up");
		
		
	}
	
	@Test(priority=3 , enabled = false)
	public void loginTest() {
		driver.findElement(email).sendKeys("sumitrawat103@gmail.com");
		driver.findElement(password).sendKeys("21061994");
		driver.findElement(LoginButton).click();
		
		String text = driver.findElement(FBloogedinUsername).getText();
	     Assert.assertEquals(text, "SuMit Nawdy Rawat");
	}
	
	
	@AfterMethod 
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class --- delete the user ");
	}
	

	@AfterTest
	public void aftertest() {
		System.out.println("After Test --- disconnect DB connection ");
		
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite --- delete the test data ");
		
	}
	
	
	
	
	

}
