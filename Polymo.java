package java_from_0;

public class Polymo {
	
	class A{
		
		
		public void show() {
			
			System.out.println("this is calssA");
			
		}
		
	}
	
	class B extends A{
		
		public void show() {
			
			System.out.println("this is calssb");
			
		}
		
		
	}
	
	class C extends A{
		public void show() {
			
			System.out.println("this is calssc");
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymo main = new Polymo();
		A obj = main.new A();
		
		obj.show();
		
		obj=main.new B();
		
		obj.show();
		
		obj=main.new C();
		obj.show();
		
		
		
		

	}

}
