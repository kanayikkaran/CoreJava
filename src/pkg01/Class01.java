package pkg01;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Class01 {

	@Test
	public void test1() {
		try{
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyyMMdd_HHmmss");
		System.out.println(ft.format(date));

		String str = "";
		System.out.println(str.length());
		int k=-3;
		for(int i=0; i<6; i++)
		{
			for(int j=5-i; j>=0; j--)
			{
				System.out.print(" ");
			}
			k=k+2;
			System.out.print("*");
			boolean a=false;
			for(int x=0; x<k; x++)
			{
				System.out.print(" ");
				a=true;
			}
			if(a)
			System.out.println("*");
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
