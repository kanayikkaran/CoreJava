package pkg01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_AnnotationSample {
	
  @Test
  public void testCase1() {
	  //test1
  }
  
  @Test
  public void testCase2() {
	  //test2
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  //navigate to home page
	  //check db connection
  }

  @AfterMethod
  public void afterMethod() {
	  //take screenshots
	  //close db connection
  }

  @BeforeClass
  public void beforeClass() {
	  //initialize browser
  }

  @AfterClass
  public void afterClass() {
	  //kill browser
  }

  @BeforeTest
  public void beforeTest() {
	//set browser profiles, preferences, 
  }

  @AfterTest
  public void afterTest() {
	  //create report
	  //zip test results, screenshots, etc
  }

  @BeforeSuite
  public void beforeSuite() {
	  // Load configuration files, Selenium drivers
  }

  @AfterSuite
  public void afterSuite() {
	  //email report, clean config/driver files.
  }

}
