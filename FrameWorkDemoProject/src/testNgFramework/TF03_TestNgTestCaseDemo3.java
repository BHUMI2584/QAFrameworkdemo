package testNgFramework;

import org.testng.annotations.Test;

public class TF03_TestNgTestCaseDemo3 {
	
	@Test (priority = 1)
	public void test4() {
		System.out.println("Test # 4");
	}
	
	@Test (priority = 0)
	public void test5() {
		System.out.println("Test # 5");
	}
	
}
