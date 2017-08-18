package problems;

import java.util.ArrayList;
import java.util.List;

public class ListComparator {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		
		l1.add("AA");
		l1.add("BB");
		
		l2.add("WW");
		l2.add("ZZ");
		
		System.out.println(compareLists(l1, l2));
	}

	public static List<String> compareLists(List<String> list1, List<String> list2)
	{
		List<String> result = new ArrayList<String>(list1);
		list1.removeAll(list2);
		list2.removeAll(result);
		result.clear();
		result.addAll(list1);
		result.addAll(list2);
		return result;
	}
	
}
