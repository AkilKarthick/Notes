package Top10StringCoding;

import java.util.Scanner;

public class OccurenceofCharacterinString {

	public static void main(String[] args) {
		
		String str1 = "hithere ";

		char targer ='h';	
		int count =0;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)== targer) {
				count++;
			} 
		}
		System.out.println("occurence of :" + targer + " is :" + count);
	}
	
	
	
}
