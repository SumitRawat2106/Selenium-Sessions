package TestNGsessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void LoginTest() {
		
		System.out.println("LoginTest ...");
		// int i = 9/0;
	}
	
	@Test(dependsOnMethods = "LoginTest")
	public void HomepageTest() {
		
		System.out.println("HomepageTest ...");
	}

}
