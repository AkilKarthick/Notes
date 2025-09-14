package collectionPratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionCodingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.Remove Duplicates from List	
		List<Integer> num1 = Arrays.asList(1,1,7,1,1,1,2,3,3,4,5);
		Set<Integer> set2 = new HashSet<>(num1);
		System.out.println(set2);
		
//		HashSet - no duplicates- nul accpted- unordered
//		TreeSet - order maintain - no null
//		linkeHashSet - insertion ordermaintained -null accepted
//		
		
// 2.Frequency Count using Map
		
		String str1 = "hello hi hello";
		Map<String,Integer> map1 = new HashMap<>();
		for(String word : str1.split(" ")) {
			map1.put(word, map1.getOrDefault(word, 0)+1);
		}
		System.out.println(map1);
		
	}

}
