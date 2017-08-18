package pkg01;

public class NewClass {

	int x;
	static int rererere;
	private static String jlkjlkjkl;
	
	public NewClass() {
		System.out.println("Inside Constructor");
	}
	
	void method1()
	{
		System.out.println("Method1");
	}
	
	private int method2()
	{
		return 5;
	}
	
	public static String method3(int x)
	{
		return "Hello";
	}
	
	int addNums(int a, int b)
	{
		int sum;
		sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Inside Main");
		
		NewClass obj = new NewClass();
		obj.method1();
		int sum2 = obj.addNums(10, 45);
		System.out.println(sum2);
		
		method3(5);
	}

}
