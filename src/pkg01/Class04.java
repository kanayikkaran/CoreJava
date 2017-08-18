package pkg01;

public class Class04 extends Class03{
int x;
public static void main(String[] args)
{

Class04 obj = new Class04();
obj.class03method01();
obj.class04method01();

}

void class04method01()
{
	x = 123456;
	System.out.println("class04method01. x="+x);
	class03method01();	
}
	
}
