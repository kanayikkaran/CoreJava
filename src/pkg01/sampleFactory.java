package pkg01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class sampleFactory {
  
	static int bmcounter1 = 0;
	static int amcounter1 = 0;
	static int bccounter1 = 0;
	static int accounter1 = 0;
	static int counter = 0;
	
	int bc=0;
	int ac=0;
	
	int bm=0;
	int am=0;
	
	int i;
	String a;
	public sampleFactory(int i, String a) {
		counter++;
		System.out.println("contructor Counter="+counter);
		this.i = i;
		this.a = a;
	}
	
	@Test
	public void testCase1() 
	{
		counter++;
		System.out.println("test1 Counter="+counter);
		System.out.println("Test1-"+i+"-"+a);
	}
	
	@Test
	public void testCase2() 
	{
		counter++;
		System.out.println("test2 Counter="+counter);
		System.out.println("Test2-"+i+"-"+a);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		counter++;
		System.out.println("beforeMethod Counter="+counter);
		bm++;
		bmcounter1++;
		System.out.println("Before Method "+bm+" "+bmcounter1);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		counter++;
		System.out.println("afteMethod Counter="+counter);
		am++;
		amcounter1++;
		System.out.println("After Method "+am+" "+amcounter1+"");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		counter++;
		System.out.println("\nbeforeClass Counter="+counter);
		bc++;
		bccounter1++;
		System.out.println("BEFORE CLASS "+bc+" "+bccounter1);
	}
	
	@AfterClass
	public void afterClass()
	{
		counter++;
		System.out.println("afterClass Counter="+counter);
		ac++;
		accounter1++;
		System.out.println("AFTER CLASS "+ac+" "+accounter1+"\n");
	}
	
	@Factory
	public static Object[] dataSupplier(){
		counter++;
		System.out.println("dataSupplier Counter="+counter);
		return new Object[]{
	      new sampleFactory(1, "a"),
	      new sampleFactory(2, "b"),
	    };
	}

}
