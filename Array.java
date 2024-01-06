package java_from_0;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//define a array with a size
		int arr[]= new int[4];
		arr[0]= 2;
		arr[1]=23;
		arr[2]=34;
		arr[3]=43;
		//arr[4]=32;
		//System.out.println(arr.length);
		
		for(int i:arr) 
		{
			//System.out.println(i);
		}
		
		int arr2[]= {1,3,5,4,4};
		//for(int i : arr2)
			//System.out.println(i);
		
		int arr3[][]= new int[4][4];
		//System.out.println(arr3.length);
		
		arr3[0][0]=1;
		arr3[0][1]=2;
		arr3[0][2]=3;
		arr3[0][3]=4;
		arr3[1][0]=5;
		arr3[1][1]=6;
		arr3[1][2]=7;
		arr3[1][3]=8;
		arr3[2][0]=9;
		arr3[2][1]=10;
		arr3[2][2]=12;
		arr3[2][3]=13;
		
		
		
		for (int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				
				System.out.println(arr3[i][j]+ " ");
			}
			
			System.out.print("");
			
		}
	}

}
