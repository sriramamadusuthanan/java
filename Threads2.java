package java_from_0;

//we can use interface of runnable 
// so that we can extend other class to our class


class A12 implements Runnable{
	
	public void run() {
		for (int i =0; i<=10;i++)
			System.out.println("Hi");
			
	}
}

class B12 implements Runnable{
	
	public void run() {
		for (int i =0; i<=100;i++)
			System.out.println("Hello");
	}
}

public class Threads2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A12 obj1 = new A12();
		
		//refernce of a interface for the object
		
		Runnable obj = new B12();
		//range from 1 to 10 
		//obj1.setPriority(Thread.MAX_PRIORITY);
		//obj.setPriority(1);
		
		// start is thread method
		Thread t1 = new Thread(obj1);
		//there is constructor which takes a object
		Thread t2 = new Thread(obj);
		
		t1.start();
		t2.start();
	}

}
