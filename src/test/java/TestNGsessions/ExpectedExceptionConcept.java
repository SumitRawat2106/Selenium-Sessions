package TestNGsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		System.out.println("Login test ... Starting...");
		int i = 9/0 ;
		System.out.println("Login test ... Ending...");
	}

}
