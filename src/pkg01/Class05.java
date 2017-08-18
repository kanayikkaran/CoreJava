package pkg01;

public class Class05 {

	public static void main(String[] args) {
		
		String testurl;
		testurl = "                                 1 Suitable cars found in your budget                              ";
		
		String[] items = testurl.split(" ");
		System.out.println("items.length="+items.length);
		for(String a: items)
		{
			if(a.length()>0)
				{
				System.out.println(a);
				break;
				}
		}
		
	}

}
