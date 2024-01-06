package java_from_0;

@FunctionalInterface
//functional interface will be with one methos in it 


interface D{ 
	
	//all the method will be public abstract
	void show();
	
}


class BD implements D{
	
	public void show() {
		System.out.println("this class to r efer the interface");
	}
}

public class Functional_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BD obj = new BD();
		obj.show();
		
	}

}
