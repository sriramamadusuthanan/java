package java_from_0;

public class Working__String {
	
	
	String name1 = "Sriram";
	char char1 = 'k';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = new String("Srirama madusuthana");
		
		System.out.println(name);
		
		System.out.println(name.hashCode());
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.concat(" designer"));
		
		//stringbuffer which is changeable
		// the differernce is thread safe
		
		StringBuffer sb = new StringBuffer("srirama madhusuthanan");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append("designer"));
		
		
		//to convert back to string 
		
		String name4 = sb.toString();

	}

}
