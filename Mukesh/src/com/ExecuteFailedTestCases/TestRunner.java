package com.ExecuteFailedTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String> list = new ArrayList<String>();//Dynamic Array
		list.add("./test-output/Failed suite [SmokeTestScenarios]/testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
