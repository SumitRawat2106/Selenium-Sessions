package ExcelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelUse.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Thinksysuser\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\ExcelUse\\Excelsheet.xlsx");
		int rowcount = reader.getRowCount("Login");
		try {
		for(int i = 2 ; i<=rowcount ; i++) {
		String data1 = reader.getCellData("Login", "Username", i);
		String data2 = reader.getCellData("Login", "Password", i);
		username.sendKeys(data1);
		password.sendKeys(data2);
		loginbutton.click();
		Thread.sleep(5000);
		driver.get(driver.getCurrentUrl());
		
		}
		}
		catch(Exception e) {
			
		}
		System.out.println("SUMIY");
	}

}


