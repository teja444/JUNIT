package org.test.com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MainTest {

	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(TestSuite.class);
		System.out.println(res.getFailureCount());
		System.out.println("Hi...");
	}

}
