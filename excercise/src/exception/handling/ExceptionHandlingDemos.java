package exception.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemos {

	public static void readAndDivide(String fileName) throws IOException, ArithmeticException {
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		try {
			String line = reader.readLine();
			
			if(line == null) {
				throw new IOException("file is empty");
			}
			
			int number =Integer.parseInt(line);
			
			if(number ==0) {
				throw new ArithmeticException("cannot divide by zero");
			}
			
			int result = 100/number;
			System.out.println("result: " + result);
			
		} finally {
			System.out.println("cloing the fine reader");
			reader.close();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String filename = "input.txt";
		
		try {
			readAndDivide(filename);
			
		}catch (IOException e) {
			System.err.println("io expceiotn caught:" + e.getMessage());
		}catch (ArithmeticException e) {
			System.err.println("arithemethic expceiton caught" + e.getMessage());
		}catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught: Invalid number format");
        } catch (Exception e) {
            System.err.println("Other Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
			
		}

	}


