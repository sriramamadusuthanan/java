package java_from_0;

public class Overloading {
	
	public class claculator{
		
		public int add(int num1, int num2) 
		{
			int result=num1+num2;
			return result;
		}
		
		public int add(int num1, int num2, int num3) 
		{
			int result=num1+num2+num3;
			return result;
		}
		

		public double add(int num1,  double num2) 
		{
			double result=num1+num2;
			return result;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		// to access the inner class
		Overloading od = new Overloading();
		claculator cal= od.new claculator();
		
		
		double num3=cal.add(2, 5.5);
		
		System.out.println(num3);
		
		
		

	}

}
