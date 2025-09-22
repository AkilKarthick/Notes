package stringpraticecoding;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringLex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println();
		System.out.println("------------"+"Java 11 String methods"+"------------");
		
		String one = "amazon";
		System.out.println("Repeat method used to repeat the string having count passed as parameter");
		System.out.println("Repeat string one 3 times :-"+one.repeat(3));
		
		System.out.println();
		
		String two = "Antarctica";
		
		System.out.println("isBlank() tells us whether the string contains only Blank spaces");
		System.out.println("Checking isBlank() with string two :- "+two.isBlank());
		String blank="     ";
		System.out.println("Checking isBlank() with string blank :- "+blank.isBlank());
		
		System.out.println();
		String whiteSpaceLeadingAndTrailing = "   Pacific  ";
		String whiteSpaceLeading = "   Pacific";
		String whiteSpaceTrailing = "Pacific    ";
		
		System.out.println("In Java 11, we have three methods to remove extra white-spaces\n"
				+ "1.strip() => All the leading and trailing white-spaces are removed.\n"
				+ "2.stripLeading() => All the leading white-spaces are removed.\n"
				+ "3.stripTrailing() => All the trailing white-spaces are removed.\n"
				+ "These methods are extension to the trim() method which we have already seen\n");
		
		System.out.println("----Demo----");
		System.out.println("Using strip() :- "+whiteSpaceLeadingAndTrailing.strip());
		System.out.println("Using stripLeading() :- "+whiteSpaceLeading.stripLeading());
		System.out.println("Using stripTrailing() :- "+whiteSpaceTrailing.stripTrailing());
		
		System.out.println();
		System.out.println("String.lines() splits the string by its line terminators and returns a Stream of Strings");
		
		
		String str1 = "A \n B \n C \n D"; 
		System.out.println("Use String.lines() on string str1");
        Stream<String> lines = str1.lines();
        lines.forEach(System.out::println);
        
        
      //Creating a Pattern through Regular Expression 
        String regex = "Hello";
        //String to be compared with RegEx 
        String input = "Hello";
        	
        //Pattern Matching done using matches() method
        System.out.println(input.matches(regex));
        //Pattern Matching done using Pattern.matches() method
        System.out.println(Pattern.matches(regex, input));

        
       var java111 = "java 11 is old";
       System.out.println(java111);
       
       var intjava11 = 121;
       System.out.println(intjava11);
       //java 15
       
       int programmingLanguage = 1;
       String languageName = switch (programmingLanguage) {
          case 1 -> "Java";
          case 2 -> "Python";
          default -> "Unknown";
       };
       System.out.println(languageName);

       //java traditinoal 
       
//       int programmingLanguage = 1;
//       String languageName;
//       switch (programmingLanguage) {
//          case 1:
//             languageName = "Java";
//             break;
//          case 2:
//             languageName = "Python";
//             break;
//          default:
//             languageName = "Unknown";
//       }

     
               String stream="JAVA";
               String ide=switch(stream)
            		   {
                  case "JAVA"->{ yield "Eclipse, IntelliJ IDEA";}
                  case "SAP"->{ yield "SAP Web IDE, SAP ABAP Development Tools";}
                   default -> { yield "Not applicable";//line 1
                       //throw  new IllegalArgumentException("Not applicable");//line 2
                   }
               };
               System.out.println("IDE for " + stream + " stream: "+ide );
           

	}

}
