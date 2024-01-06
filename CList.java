package java_from_0;
import java.util.List;
import java.util.ArrayList;

public class CList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num2 = new ArrayList<Integer>();
		
		num2.add(1);
		num2.add(23);
		num2.add(12);
		num2.add(56);
		
		System.out.println(num2.get(0));
		System.out.println(num2.indexOf(23));
		System.out.println(num2.isEmpty());
		System.out.println(num2.lastIndexOf(num2));
		
		

	}

}
