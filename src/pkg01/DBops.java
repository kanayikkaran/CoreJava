package pkg01;

public class DBops {

	public static void main(String[] args) {
	
		String[] a = {"param1", "param2", "param3"};
		
		System.out.println(returnsomething(a));
		
		
	}

	public static String returnsomething(String[] params)
	{
		
		System.out.println("params.length="+params.length);
		for(int i=0; i<params.length; i++)
		{
			System.out.println("value="+params[i]);
		}
		return "";
	}
}

