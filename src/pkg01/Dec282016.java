package pkg01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dec282016 {

	public interface DemoInter { // Interface
		
		// Declaration of variables and methods
		int x = 0;
		public int sum(int a, int b);
		public void print(String str);
		public static String variable1 = "var1"; 
		boolean y = false; 
	}

	int diff(int a, int b) // class method
	{
		return a*b;
	}
	
	public Dec282016() { // class constructor
		Class2 obj2 = new Class2();
		System.out.println(obj2.sum(10, 25));
	}

	public static void main(String[] args) {
		
		Dec282016 obj1 = new Dec282016();
		System.out.println(obj1.diff(65, 42));
		
		List<String> strlist = new ArrayList<String>();
		strlist.add("str1"); 
		strlist.add("str10");
		strlist.get(0);
		
		strlist.remove(1);
		
		Iterator<String> itr = strlist.iterator();
		while(itr.hasNext())
		{
			itr.next();
		}
	}
	
	public class Class2 implements DemoInter{ // class implementing Interface

		@Override
		public int sum(int a, int b) { // definition of implemented method
			return a+b;
		}
		
		public int diff(int a, int b){ // own method
			return a-b;
		}

		@Override
		public void print(String str) { // definition of implemented method
			System.out.println(str);
		}
		
	}	
	
}