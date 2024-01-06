package java_from_0;

public class Expectioonhandling {
	
	public static void main(String[] args) {
	int i =0;	
	int j = 0;
	
	
	try
	{
		j=18/i;
	}
	
	
	
	catch(Exception e) {
		
		System.out.println("something went wromg" + e);
	}
	
	System.out.println(j);
	System.out.println("the left out ");
	
	

}
}