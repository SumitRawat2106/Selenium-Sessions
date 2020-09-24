package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricbuzz {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22777/nz-vs-ind-5th-t20i-india-tour-of-new-zealand-2020");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ArrayList playernames =  new ArrayList ();
		playernames.add("Rahul (wk)" );
		playernames.add("Samson");
		playernames.add("Rohit (c)");
		playernames.add("Shreyas Iyer");
		playernames.add("Manish Pandey");
		Giveplayername(playernames ,driver );
	}
	
	
     public static void Giveplayername(ArrayList playernames , WebDriver driver) {
      
    	 for(int i = 0 ; i<playernames.size() ; i++) { 	
    	String player  =  (String) playernames.get(i);
         	ArrayList t = getscorecard(driver, player);
         	 System.out.print(player);
         	for(int k= player.length(); k< 16 ; k ++) {
         		System.out.print(" ");
         		
         	}
         	 for (int j = 0 ; j<t.size(); j++) {
         		String text =  (String) t.get(j);
         		System.out.print(t.get(j));
         		
         			for (int m =text.length() ; m<23 ;m++ ) {
             			System.out.print(" "); 	
         	 }
 
         	 }
         	System.out.println();
         	System.out.println();
    	 }

     }	 
     
	public static ArrayList getscorecard(WebDriver driver, String player) {
		
		ArrayList ar  = new ArrayList();
		List<WebElement> list = driver.findElements(By.xpath("//a[text() = ' "+ player+ " ']//parent::div//following-sibling::div"));
		for (int i = 0 ; i<list.size(); i++) {
			String Text = list.get(i).getText();
			 ar.add(Text);
			 
		}
		return ar ;
	
			
		}
		
	}


