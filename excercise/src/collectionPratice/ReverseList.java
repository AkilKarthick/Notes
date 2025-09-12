package collectionPratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("akil","karthick","java");
		
		System.out.println("orginal" + list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
