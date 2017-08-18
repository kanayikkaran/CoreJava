package pkg01;

public class ArraySample {

	public ArraySample() {
		
	}

	public static void main(String[] args) {
		
		int a[] = {9,1,2,3,4};
		
		int b[] = new int[5];
		
		int a1 = 0; int a2=1;
		
		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//System.out.println(a[0]);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		//System.out.println(b[0]);
		
		String d[] = new String[5];
		d[0] = "INDEX 0"; d[3] = "INDEX 3";
		for(int i=0; i<d.length; i++)
		{
			System.out.println(d[i]);
		}
		
		{
			int ax = 100; int bx = 0;
			//System.out.println(ax/bx);
		}
		int ax = 100; int bx = 1;
		try {
			
			//throw new Exception("Custom Exception");
			System.out.println(ax/bx);
			/*System.out.println(d[10]);
			System.out.println(b[20]);*/
		} 
		catch(ArithmeticException e)
		{
			System.out.println("Math error");
			bx = 1;
			System.out.println(ax/bx);
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
		System.out.println("Please enter a valid index");
		System.out.println(d[0]);
		System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
		System.out.println("General Exception");
		System.out.println(e.getMessage());
		}
		finally{
			System.out.println("FINALLY");
		}
		
		System.out.println("Statement");
		
		System.out.println("Very Imp");
		
		try {
			print(); throw new Exception("NEW CUSTOM EXCEPTION");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

	static void print() throws ArithmeticException
	{
		System.out.println("PRINT");
		throw new ArithmeticException("INSIDE PRINT");
	}
	
}
