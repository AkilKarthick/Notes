package java12feature;

public class Switchdemo {

	 

		public static void main(String[] args) {
			
			
			 String stream = "JAVA";
		        String ide = switch (stream) {
		        
		        // yield keyword is used to return the value of the case expression from the switch case
		        
		            case "JAVA"-> { yield "Eclipse, IntelliJ IDEA"; }
		            case "SAP" -> { yield "SAP Web IDE, SAP ABAP Development Tools "; }
		            default -> {
		                yield "Not applicable";//line 1
		                //throw  new IllegalArgumentException("Not applicable");//line 2
		            }
		        };
		        System.out.println("IDE for " + stream + " stream: "+ide );

		}

	}



