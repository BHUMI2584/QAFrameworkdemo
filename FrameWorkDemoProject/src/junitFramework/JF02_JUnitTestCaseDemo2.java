package junitFramework;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class JF02_JUnitTestCaseDemo2 {

	/* This Rule annotation collects all errors from the all catch and give Test Fail 
	 otherwise it will run all tests as Pass */
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	/* @Ignore or put // before any Test annotation it will comment everything under that Test */
	
	@Test  
	public void test3() {
		System.out.println("I am in testAssert 2");
		String actualErrormessage = "abc";
		String expectedErrormessage = "abc";
		Assert.assertEquals(expectedErrormessage, actualErrormessage); 
		
		// In company we used only this Assert
		
		System.out.println("After assert");
		//Assert.assertTrue("Verifying if 2>3", 2>3);
		Assert.assertTrue("Verifying if 2<3", 2<3);
		System.out.println("After 2nd Assert");
		
	}

	/* After failing any assert still if we want to continue to run the rest of the code
	then we will use Try-Catch */

	@Test  
	public void test4() {
		System.out.println("I am in testAssert 3");
		String actualErrormessage = "abc";
		String expectedErrormessage = "abc";
		
		try {
			Assert.assertEquals(expectedErrormessage, actualErrormessage);
		}
		catch (Throwable t) {
			System.out.println("I am in Catch 1");
			errCol.addError(t);
			System.out.println(t);
		}
			
		System.out.println("After 1st Assert");

		try {
			//Assert.assertTrue("Verifying if 2>3", 2>3);
			Assert.assertTrue("Verifying if 2<3", 2<3);
		}
		catch (Throwable t) {
			System.out.println("I am in Catch 2");
			errCol.addError(t);
			System.out.println(t);
		}
		
		System.out.println("After 2nd Assert");
		
	}
	
}
