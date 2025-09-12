package collectionPratice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Apple", 50);
        map.put("Orange", 30);
        map.put("Banana", 20);
        
        TreeMap<String,Integer> sortedMap = new TreeMap<>(map);
        
        
        System.out.println("Original Map: " + map);
        System.out.println("Sorted Map by Keys: " + sortedMap);
        
        
	}

}
