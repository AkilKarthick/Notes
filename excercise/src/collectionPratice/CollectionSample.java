package collectionPratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionSample {

	public static void main(String[] args) {

//list
//arraylist
		
		List<String> l1 = new ArrayList<>();
		l1.add("akil");
		l1.add("karthic");
		l1.add(null);
		
		System.out.println(l1.get(2));
		for(String s: l1) {
			System.out.println(s);
			
		}
//		good for frequent inserts/removes
		List<String> l2 = new LinkedList<>();
		l2.add("akil");
		l2.add("karthic");
		l2.add(null);
		
		System.out.println(l2);
		
	//it allows one null values fast, unordered	
		Set<String> s1 = new HashSet<>();
		s1.add("a");
		s1.add("d");
		s1.add(null);
		s1.add("b");
		s1.add("a");
		
		System.out.println(s1);
		
	}

}
