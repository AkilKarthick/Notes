package codingPratice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesPratice {


	public static String removeDup(String str) {
		
		Set<Character>  uniqueWord= new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char c: str.toCharArray()) {
			if(!uniqueWord.contains(c)) {
				uniqueWord.add(c);
				result.append(c);
		}}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="karthick";
		System.out.println("removeDup: "+ removeDup(input));
		
	}

}
