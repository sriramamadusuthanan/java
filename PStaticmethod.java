package java_from_0;

public class PStaticmethod {
	
	public static void show()
	{
		System.out.println("this is a static method");
	}
	
	public void show1()
	{
		System.out.println("this is a non Static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling a static method without a object
		
		PStaticmethod.show();
		
		//create a object to instatiate a class in non static form
		
		PStaticmethod ps = new PStaticmethod();
		
		ps.show1();

	}

}
