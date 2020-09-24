package TestNGsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount=10)
	public void Createuser() {
		
		System.out.println("Create user ...");
	}

}
