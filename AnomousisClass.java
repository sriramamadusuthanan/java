package java_from_0;

class AB1{
	
	public void show() {
		
		System.out.println("this Ashow");
		
	}
}

public class AnomousisClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AB1 obj = new AB1() {
			public void show() {
				System.out.println("this is new show");
			}
			
			public void show2() {
				System.out.println("this 2nd new show");
			}
		};
		
		obj.show();
		obj.show();

	}

}
