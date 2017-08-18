package com.sample.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SuiteSample2 {
  @Test(groups = { "group1" })
  public void testCase1() {
  System.out.println("SuiteSample2 Case1");
  }
  
  @Test(groups = { "group2" })
  public void testCase2() {
  System.out.println("SuiteSample2 Case2");
  }
  
  @Test(groups = { "group3" })
  public void testCase3() {
  System.out.println("SuiteSample2 Case3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("SuiteSample2 BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("SuiteSample2 AfterMethod");
  }

}
