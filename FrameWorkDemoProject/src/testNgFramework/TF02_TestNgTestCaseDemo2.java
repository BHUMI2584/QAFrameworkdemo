package testNgFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TF02_TestNgTestCaseDemo2 {
	

	@Test 
	public void test3() {
		
		System.out.println("I am in testAssert 2");
		String actualErrormessage = "abc";
		String expectedErrormessage = "abc";
		Assert.assertEquals(expectedErrormessage, actualErrormessage); 
		
		// In company we used only this Assert
		
		System.out.println("After assert");
		//Assert.assertTrue(2>3, "Verifying if 2>3");
		Assert.assertTrue(2<3, "Verify if 2<3");
		System.out.println("After 2nd Assert");
		
	}
	
}
