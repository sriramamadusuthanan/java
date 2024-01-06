package java_from_0;

class Ab{
	
	public void show() {
		
		System.out.println("this is A class");
	}
}

class Bc extends Ab{
	
	//Annotations in Java provide additional 
	//information to the compiler and JVM.
	
	 
	@Override
	public void show() {
		
		System.out.println("this is calss B");
	}
	
}

public class Annotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bc obj = new Bc();
		
		obj.show();
	}

}
