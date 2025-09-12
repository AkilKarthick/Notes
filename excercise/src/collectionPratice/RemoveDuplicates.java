package collectionPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
        
        System.out.println(list);
        System.out.println(list1);
        
        Set<Integer> s1 = new TreeSet<>(list);
        
        System.out.println(s1);
        
	}

}
