package collectionPratice;

import java.util.HashMap;
import java.util.Map;

public class HashMapIternation {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("a",null);
		map.put("b",null);
		map.put("c",null);
		map.put(null,null);
		
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}

}
