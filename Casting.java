package java_from_0;

public class Casting {
	
	int a = 1255;
	byte b = (byte)a;

	public static void main(String[] args) {
		
		Casting sc = new Casting();
		
		System.out.println(sc.b);
		// TODO Auto-generated method stub
		
		int c=3;
		int result = c++;
		int result1=+c;
		System.out.println(result1);
		
		int d=1;
		byte e=1;
		
		boolean result2 = d==e;
		
		System.out.println(result2);
		
		//ternoray opr
		
		int f= 13;
		
		int result4 = f%2==0 ? 10 : 20;
		
		System.out.println(result4);

	}

}
