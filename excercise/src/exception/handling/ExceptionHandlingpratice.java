package exception.handling;

import java.io.IOException;

public class ExceptionHandlingpratice {

	public static void fetchingNuumber(int num) throws ArithmeticException, IOException {
			
			if(num <=0) {
				throw new ArithmeticException("not a valid number");
			}
	}
	
	
	
	public static void main(String[] args) {
		
		try {	
//			int i=10;
//			
//			int result = i/0;
			 
			fetchingNuumber(-1);
			
		}catch(Exception e)
		{
			System.out.println("exception caught:" + e.getMessage());
		}finally {
			System.out.println("close this session");
		}
		

	}

}
