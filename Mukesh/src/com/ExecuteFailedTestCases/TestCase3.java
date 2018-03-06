package com.ExecuteFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public void TestWordPress() {
		Assert.assertTrue(false);//Forcefully failing the case and Make it true for Test Pass
		System.out.println("WordPress is working as expected");
	}
}
