package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
WebDriver driver ;
	
	By email = By.id("email");
	By password = By.id("pass");
	By LoginButton  = By.xpath("//input[@type='submit']");
	By ForgottenaccountLink = By.linkText("Forgotten account?");
	By FBloogedinUsername = By.xpath("//div[text() = 'SuMit Nawdy Rawat']");
	
	@BeforeTest
	@Parameters({"browser"})
		public void setup(String browserName) throws Exception {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please enter correct browser name");
			throw new Exception("No such browser Exception");
		}
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		@Test(priority=1)
		public void ForgottenaccountLinkTest() {
			
			Assert.assertTrue(driver.findElement(ForgottenaccountLink).isDisplayed());	
			
		}
		
		@Test(priority=2 )
		public void pageTitleTest() {
			String ActualTitle =  driver.getTitle();
			System.out.println(ActualTitle);
			Assert.assertEquals(ActualTitle, "Facebook – log in or sign up");
			
			
		}
		
		@Test(priority=3)
		public void loginTest() {
			driver.findElement(email).sendKeys("sumitrawat103@gmail.com");
			driver.findElement(password).sendKeys("21061994");
			driver.findElement(LoginButton).click();
			
			String text = driver.findElement(FBloogedinUsername).getText();
		     Assert.assertEquals(text, "SuMit Nawdy Rawat");
		}
		
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}

}
