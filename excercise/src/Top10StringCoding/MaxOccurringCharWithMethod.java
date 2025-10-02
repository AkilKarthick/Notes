package Top10StringCoding;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try with infy lapto on github and try to cmt
		
		String str ="jajjjjjjvvvva";
		Map<Character, Integer> charCountMap = new HashMap<>();
		char maxChar = ' ';
		int maxCount = 0;
		
		for(char c: str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) +1);
		}
		
		System.out.println(charCountMap);
		
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();		
				System.out.println("max occuring character: " + maxChar + " is " + maxCount + " times");
				
			}
		}	
	}
}
