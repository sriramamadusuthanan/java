package java_from_0;

//superclass
class A 
{
	
	public A()
	{
		super();
		// every constructor by default will have a super
		//key word at first
		
		System.out.println("THis is A");
	}
	
	public A(int n)
	{
		super();
		System.out.println("THis is A with int");
	}
	
}

class B extends A
{
	
	public B()
	{
		super();
		System.out.println("this is B");
	}
	
	public B(int m)
	{
		super(m );
		// super keyword call the constructore of the super class
		// to call the constructor with parameter u can 
		//explitely add a parameter to the super keyword
		System.out.println("this is B with int");
	}
	
}


public class This_super {

	public static void main(String[] args) {
		
	    new B(5);
		B obj2 = new B(); 
		

	}

}
