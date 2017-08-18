package problems;

import java.util.Scanner;

public class IPValidation {
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		//System.out.println("The IP is : "+input);
		String[] vals = input.split("\\.");
		if(vals.length!=4)
			System.out.println("Invalid IP");
		else
		{
			int valid = 0;
			for(int i=0;i<vals.length;i++)
			{
				int valsint = Integer.parseInt(vals[i]);
				if(i==0)
				{
					if(valsint>0 && valsint<=255)
						valid++;
				}
				else
				{
					if(valsint>=0 && valsint<=255)
					valid++;
				}
			}
		if(valid==4)
		{
			System.out.println("Valid IP");
		}
		else
		{
			System.out.println("Invalid IP");
		}
			
		}
		
		in.close();
	}

}
