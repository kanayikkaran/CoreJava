package com.sample.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	  @DataProvider(name="thisisadataprovider")
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a", "a" },
	      new Object[] { 2, "b", "a" },
	      new Object[] { 3, "c", "a" },
	    };
	  }

  @Test(priority=3, dataProvider = "thisisadataprovider")
  public void f(Integer n, String s, String x) {
	  System.out.println("Test "+n+" "+s);
	  Assert.assertEquals(s, x, "Failure message.");
  }
  
  @Test(priority=1, enabled=false)
  public void g()
  {
	  System.out.println("Test Method G");
	  Assert.fail();
  }
  
  @Test(priority=2, dependsOnMethods={"g"}, enabled=false)
  public void a()
  {
	  System.out.println("Test Method A");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }



  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
