package pkg01;

import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		
/*		List<String> list = new ArrayList<String>();
		list.add("item2");
		list.add("item1");
		list.add("item6");
		list.add("item4");
		list.add("item2");
		System.out.println("List Size="+list.size());
		System.out.println("List="+list);

		System.out.println(list.get(2));
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println("List Item="+itr.next());	
		}
		
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println("Set="+set);
		
		list.remove(0);
		System.out.println("List Size="+list.size());
		System.out.println("List="+list);
		
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(Integer.valueOf(9));
		intSet.add(Integer.valueOf(1));
		intSet.add(Integer.valueOf(5));
		intSet.add(Integer.valueOf(4));
		System.out.println("intSet="+intSet);
		
		Set<String> stringSet = new TreeSet<String>();
		stringSet.add("a");
		stringSet.add("d");
		stringSet.add("c");
		stringSet.add("b");
		System.out.println("stringSet="+stringSet);*/
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "This is item with key 1");
		map.put(10, "This is mapped to key 10");
		map.put(5, "Mapped to key 5");
		map.put(1, "Second value for 1");
		
		System.out.println("MapSize="+map.size());
		System.out.println("map="+map);
		map.remove(1);
		System.out.println("UpdatedMapSize="+map.size());
		System.out.println("map="+map);
		
		/*List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		Map<String, String> map2 = new HashMap<String, String>();*/
		
	}

}
