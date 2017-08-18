package problems;

public class FAR_AmountOps {
	
	static float getAmount(String input)
	{
		if(input==null)
			return 0;
		if(input.equalsIgnoreCase(""))
			return 0;
		input = input.replace(",", "");
		input = input.replace("$", "");
		input = input.replace(" ", "");
		return Float.parseFloat(input);
		
	}
	public static void main(String[] args) {

		System.out.println(getAmount("-$ 133,942"));
		Float a = getAmount("$ 100,000");
		float paidamt =  a * (100 - Float.valueOf(10) - 0)/100;
		System.out.println(paidamt);
		
	}

}
