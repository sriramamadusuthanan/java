package java_from_0;

class A1 extends Thread{
	
	public void run() {
		for (int i =0; i<=100;i++)
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

class B1 extends Thread{
	
	public void run() {
		for (int i =0; i<=100;i++)
			System.out.println("Hello");
	}
}

public class Threads1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 obj1 = new A1();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B1 obj = new B1();
		//range from 1 to 10 
		//obj1.setPriority(Thread.MAX_PRIORITY);
		//obj.setPriority(1);
		obj1.start();
		obj.start();
	}

}
