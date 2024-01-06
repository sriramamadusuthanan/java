package java_from_0;

class sriramExpection extends Exception {
	
	public void message() {
		
		System.out.println("thisexpection i created");
		
	}
	
}



public class Throw_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=50;
		int j=23;
		
		try {
			
			j=j/i;
			
			if(j==0) {
				throw new sriramExpection();
			}
			
		}
		
		catch(sriramExpection s){
			
			System.out.println(s);
			
		}

	}

}
