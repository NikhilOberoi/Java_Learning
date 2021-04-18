package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashmapIterator {
	public static void main(String[] args) {
		HashMap<String, Integer> HM = new HashMap<String, Integer>();
		HM.put("Abc", 1);
		HM.put("Def", 2);
		
		System.out.println(HM.hashCode());
		
		// Iterator with keySet() to print keys
		Iterator<String> IT = HM.keySet().iterator();
		while (IT.hasNext()) {
			String key = (String) IT.next();
			System.out.println("Key is: " + key);
		}

		// Iterator with values() to print values
		Iterator<Integer> val = HM.values().iterator();
		while (val.hasNext()) {
			int value = val.next();
			System.out.println("Values: " + value);
		}

		// Iterator with entrySet()
		Iterator<Entry<String, Integer>> it = HM.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Integer> mapEntry = (Entry<String,Integer>) it.next();
			
			System.out.println(mapEntry.getValue());
			System.out.println(mapEntry.getKey());
		}
		
		// using for loop with Map.Entry
		for(Map.Entry<String,Integer> mapData : HM.entrySet()) {
			 String key = mapData.getKey();
			 int val1 = mapData.getValue();
			 System.out.println("key: "+key+" Value is: "+val1);
		}
	}
}