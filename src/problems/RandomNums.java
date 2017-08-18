package problems;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNums {

	public static void main(String[] args) {
		
		int max = 10;
		int count = 8;
		
		Random r = new Random();
		
		Set<Integer> nums = new HashSet<Integer>();
		while(nums.size()<count)
		{
			nums.add(Integer.valueOf(r.nextInt(max)));
		}
		
		int[] finalnums = new int[nums.size()];
		int i = 0;
		for(Integer item:nums)
		{
			finalnums[i] = item.intValue();
		}
		
	}

}
