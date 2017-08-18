package com.java.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleClass {

	@Test
	public void test1()
	{
		Assert.assertTrue(true);
		System.out.println("After assertion");
	}

}
