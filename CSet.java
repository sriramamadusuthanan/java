package java_from_0;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> num3= new HashSet<Integer>();
		
		num3.add(1);
		num3.add(23);
		num3.add(5);
		num3.add(75);
		
		//System.out.println(num3);
		for (int m : num3)
			System.out.println(m);
		
		
		//treeset
		
		Set<Integer> num4= new TreeSet<Integer>();
		
		num4.add(100);
		num4.add(23);
		num4.add(5);
		num4.add(75);
		
		//System.out.println(num3);
		for (int m : num4)
			System.out.println(m);
		
		
	
	
		
	}

}
