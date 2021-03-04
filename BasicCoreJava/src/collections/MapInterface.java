package collections;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();

		map.put("name1", "Anand");
		map.put("name2", "Anjali");
		map.put("name3", "Shubhangi");
		map.put("name4", "Santosh");

		System.out.println(map.get("name2"));
		
		System.out.println("***********************************");
		
		Map<Integer, String> map1 = new HashMap<>();

		map1.put(1, "Anand");
		map1.put(2, "Anjali");
		map1.put(3, "Shubhangi");
		map1.put(4, "Santosh");
		map1.put(null, "temp");

		System.out.println(map1.get(2));
		
		System.out.println("***********************************");
		
		Set<Integer> set=map1.keySet();
		for(Integer s:set)
		{
			System.out.println(map1.get(s));
			
		}
		
		
//		map = new Hashtable<>();
//
//		map.put("name1", "Anand");
//		map.put("name2", "Anjali");
//		map.put("name3", "Shubhangi");
//		map.put("name4", "Santosh");
//		map.put(null, "temp3");
//
//		System.out.println(map.get("name2"));
		

//		System.out.println(map.get(2));
		
		

//		Iterator<Integer> it = map.iterator();
//
//		while (it.hasNext())
//			System.out.println(it.next());

	}

}
