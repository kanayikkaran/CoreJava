package pkg01;

public class StringOpsForAutomation {

	public static void main(String[] args) {
		
		String a = "ExpirationDate;CreditRating;Notes";
		
		String[] b = a.split(";");
		
		String[] dec = new String[b.length]; 
		String[] param = new String[b.length];
		String[] def = new String[b.length];
		
		for(int i=0; i<b.length; i++)
		{
			dec[i] = "public String "+b[i].substring(0, b[i].length())+";";
			param[i] = "String "+b[i].substring(0, b[i].length())+",";
			def[i] = "this."+b[i]+"="+b[i].substring(0, b[i].length())+";";
		}
		
		String decfinal = "";
		String paramfinal = "";
		String deffinal = "";
		for(int i=0; i<b.length; i++)
		{
			decfinal = decfinal + dec[i] + "\n";
			paramfinal = paramfinal + param[i] + " ";
			deffinal = deffinal + def[i] + "\n";
		}
		
		System.out.println(decfinal);
		System.out.println(paramfinal);
		System.out.println();
		System.out.println(deffinal);
	}

}
