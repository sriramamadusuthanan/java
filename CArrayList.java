package java_from_0;

import java.util.ArrayList;
import java.util.Collection;

public class CArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection is interface so u can't create a direct object of it
		
		Collection <Integer>num = new ArrayList<Integer>();
		
		num.add(2);
		num.add(23);
		num.add(222);
		num.add(55);
		
		//u can directly print arraylist
		
		System.out.println(num);
		
		for(int n : num) {
			System.out.println(n);
		}

	}

}
