package java12feature;

public class swithcDemo2 {

	public static void main(String[] args) {

		
		//traditonal approach
		
		/*
		 
		* int programmingLanguage = 1;
			String languageName;
			switch (programmingLanguage) {
			   case 1:
			      languageName  = "Java";
			      break;
				}
		 */
	
		/* Only acts as a statement to control flow.
		 * Needs explicit " breaks " to prevent fall-through errors
		 * Assignment is done manually inside each case
		 * 
		 */
		
		
		/*
		 * Switch can be used as an expression, directly returning a value
		 * No fall-through; arrow syntax is concise, break/yield can be used for values
		 */

		String cardType = "business"; 
        int creditScore = switch (cardType) {
        
            case "Premium"-> 750; 
            
            case "Commercial","business" -> 600; 
            
            default -> throw new IllegalArgumentException("Invalid card:    " + cardType); 
        }; 
        System.out.println("Your card type is : " +cardType+" and your credit Score is : "+creditScore); 
    }

	}


