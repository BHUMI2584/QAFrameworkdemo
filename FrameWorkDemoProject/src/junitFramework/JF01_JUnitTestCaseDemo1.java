package junitFramework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JF01_JUnitTestCaseDemo1 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test # 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test # 2");
	}
	
}
