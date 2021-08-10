package junitFramework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	JF01_JUnitTestCaseDemo1.class,
	JF02_JUnitTestCaseDemo2.class
})

public class JunitSuiteRunnerTest {
	
}