package java_from_0;

public class Var_Static {
	
	String name;
	int Age;
	String Gender;
	// static variable
	// is common for all 
	static int number;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Var_Static vs = new Var_Static();
		
		vs.Age=9;
		vs.Gender="male";
		vs.name="madhu";
		
		//static variable can be called with classs name 
		
		Var_Static.number=23;  

	}

}
