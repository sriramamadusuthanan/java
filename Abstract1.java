package java_from_0;

//abstract calss
abstract class Car{
	//abstract method can be declared in abstract class only 
	public abstract void  Drive();
	
	
	public void PlayMusic() {
		
		System.out.println("playing music ");
	}
	
}


class BMW extends Car{ //concerate class
	
	public void Drive() {
		//the bwm class shold define drive 
		System.out.println("driving");
	}
	
	
	
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no object can be created to abstract class
		//but refernce can be
		
		BMW obj= new BMW();
		
		
		obj.Drive();
		obj.PlayMusic();

	}

}
