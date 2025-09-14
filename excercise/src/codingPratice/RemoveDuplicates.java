package codingPratice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	
	public static String removeDuplicate(String s) {
		
		Set<Character> unique = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char c : s.toCharArray()){
		if(!unique.contains(c)) {
			unique.add(c);
			result.append(c);
		}}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		 
		String input = "hello";

		System.out.println(removeDuplicate(input));
	}

}
