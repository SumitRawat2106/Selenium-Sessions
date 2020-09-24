package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("justAnInputBox")).click();
		
	//	SelectChoiceValue(driver , "choice 6");
	//	SelectChoiceValue(driver , "choice 6 2 1" , "choice 6 2 3");
		SelectChoiceValue(driver , "All");
	}

	
	
	public static void SelectChoiceValue(WebDriver driver , String...value ) {
		List<WebElement> choices = driver.findElements(By.xpath("//div[@class = 'comboTreeDropDownContainer']//ul//li//span[@class= 'comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("All")) {
			 
			   for (int i = 0 ; i<choices.size() ; i++) {
				  String text =  choices.get(i).getText();
				  for (int k = 0 ; k<value.length ; k++) {
					  if (text.equals(value[k])) {
						  choices.get(i).click();
						  break;
					  }
				  }
		}  
	   }
		
		else {
			 for (int all = 0 ; all<choices.size() ; all++) {
				 try {
					 choices.get(all).click();
				 }
			catch(Exception e){
				
			}
			 }
		}
		
		

	}

}
