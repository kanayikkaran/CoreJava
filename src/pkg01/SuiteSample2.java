package pkg01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SuiteSample2 {
  @Test
  public void testCase1() {
  System.out.println("Case1");
  }
  
  @Test
  public void testCase2() {
  System.out.println("Case2");
  }
  
  @Test
  public void testCase3() {
  System.out.println("Case3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
