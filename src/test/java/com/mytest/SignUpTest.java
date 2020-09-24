package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	
	WebDriver driver ;
	By TermsLink = By.linkText("Terms");
	By CreatePageLink = By.linkText("Create a Page");
	By CreatePageInsideLink  = By.xpath("//span[text()='Join or log in to Facebook   ']");
	
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
		public void TermsLinkTest() {
			
			Assert.assertTrue(driver.findElement(TermsLink).isDisplayed());	
			
		}
		
		@Test(priority=2)
		public void CreatePageLinkClick() {
			
			driver.findElement(CreatePageLink).click();
			
			Assert.assertTrue(driver.findElement(CreatePageInsideLink).isDisplayed());
			
		}
		
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}

}
