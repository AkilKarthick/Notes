package java8;

import java.util.Arrays;
import java.util.List;

public class IterateviaLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		System.out.println("all elements");
		
		li.forEach(a->System.out.println(a));

		System.out.println("greate then 2");
		li.forEach(n->{
			if(n >2)
				System.out.println(n);
		});
	}

}
