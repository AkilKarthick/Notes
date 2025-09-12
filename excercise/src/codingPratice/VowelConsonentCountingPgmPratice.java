package codingPratice;




//Count the number of vowels and consonants
public class VowelConsonentCountingPgmPratice {

	public static void main(String[] args) {
		
		int vowel=0;
		int Cosonent=0;
		
		String word = "Akil";
		
		word = word.toLowerCase();
		
		for(int i=0; i< word.length(); i++) {
			char ch = word.charAt(i);
			
			if(ch >= 'a' && ch <='z') {
				if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowel++;
				}else
					Cosonent++;
			}
		}
		System.out.println("Number of vowels: " + vowel);
	    System.out.println("Number of consonants: " + Cosonent);
	}
	
}
