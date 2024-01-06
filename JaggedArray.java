package java_from_0;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr2[][] =  new int[3][];  //internal array size is not defined
		
		// individualy we are specifing the length 
		//of the inner array
		
		arr2[0] = new int [3];
		arr2[1] = new int [5];
		arr2[2] = new int [2];
		
		for (int i =0; i<3; i++) 
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				arr2[i][j] = (int)(Math.random()*10);
				
				System.out.print(arr2[i][j] + " ");
			}
			
			
			System.out.println();
			
		}

	}

}
