package java_from_0;

//we can use interface of runnable 
// so that we can extend other class to our class


class counder{
	
	int count;
	//sysnchronized make sure that the method is used bu one at a time
	public synchronized void counder1() {
		count++;
	}
}



public class Threads3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//reference to counder
		
		counder c= new counder();
		
		Runnable obj1 = new Runnable() {
			
			public void run() {
				for (int i =0; i<=1000;i++)
					c.counder1();
					
			}
			
		};
		
		//refernce of a interface for the object
		//lets use lamda expression
		Runnable obj =()->
		{
			for (int i =0; i<=1000;i++)
					c.counder1();
		};
		//range from 1 to 10 
		//obj1.setPriority(Thread.MAX_PRIORITY);
		//obj.setPriority(1);
		
		// start is thread method
		Thread t1 = new Thread(obj1);
		//there is constructor which takes a object
		Thread t2 = new Thread(obj);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
	}

}
