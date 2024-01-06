package java_from_0;

public class Multidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
				System.out.print(arr3[i][j]+ " ");
			}
			
			System.out.println();
			
		}
	}

	

}
