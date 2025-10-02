package Stringmostaskedcoding2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class dmoe {

	public static void main(String[] args) {
		//esaily count the occure of each character in s atring
		
		String word ="akila";
		 Map<Character, Integer> charCount = new LinkedHashMap<>();
		 
		 for(char chararryawor :word.toCharArray()) {
			 charCount.put(chararryawor,charCount.getOrDefault(chararryawor, 0) +1 );
		 }
		 System.out.println(charCount);

	}

}


