package java11features;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String s = "  Hello \nWorld  ";

	        System.out.println(s.isBlank());     // false
	       String s1=  s.strip(); //strip(): Removes leading and trailing whitespace (better than trim())
	       System.out.println( "Strips :" +s1);
	       //lines(): Returns a stream of lines extracted from the string
	        s.lines().forEach(System.out::println);  // Prints "  Hello " and "World  "
	        System.out.println(s.repeat(3)); // Hi!Hi!Hi!
	        System.out.println("hi".repeat(3)); // Hi!Hi!Hi!
    
	    }
	}


