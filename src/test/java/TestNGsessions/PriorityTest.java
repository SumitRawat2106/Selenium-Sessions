package TestNGsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	
	//Non-priority test cases are executed first before priority test cases
	
	@Test(priority = 3)
	public void Test1() {
		System.out.println("Test 1");
		
	}
	
	@Test(priority = 2)
	public void Test2() {
		System.out.println("Test 2");
	}

	
	@Test(priority = 1)
	public void Test3() {
		System.out.println("Test 3");
	}
	
	@Test
	public void Test4() {
		System.out.println("Test 4");
	}


}
