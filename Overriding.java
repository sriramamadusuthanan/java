package java_from_0;


// override
class AB 
{
	public void show()
	{
		System.out.println("in show method");
		
	}
	
	public void show2()
	{
		System.out.println("in the method123");
	}
}

class bc extends AB
{
	//this will override the show in AB class
	public void show()
	{
		System.out.println("this is override of show in class AB");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bc obj = new bc();
		
		obj.show();
		obj.show2();

	}

}
