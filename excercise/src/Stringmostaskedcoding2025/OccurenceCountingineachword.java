package Stringmostaskedcoding2025;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceCountingineachword {
	
	public static String findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCount);
		return "charCount" + charCount;	
	}
	public static void main(String[] args) {
		findFirstNonRepeatedChar("akila");
	}
	}
//		
//		//Count the occurrence of each character in a string.
//		
//		String count = "Akilkarthick";
//		
//		Map<Character, Long> occurence = count.chars() //produce a int stream of int code pointing to each charaacter
//								.mapToObj(c ->(char)c)  // this to convert char primitve int to objcet
//								.collect(Collectors.groupingBy(s->s,Collectors.counting()));  // collector required object
//		System.out.println(occurence);
//
//		
//		//find frequency of each character in a string
//		
//				String input = "akilkarthick";
//				Map<Character, Long> freq = input.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(s->s, Collectors.counting()));
//				
//				
		
