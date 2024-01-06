package java_from_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FinallyKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j= 2;
		BufferedReader br=null;
		int num=0;
		
		try {
			j=j/i;
			
			InputStreamReader in = new InputStreamReader(System.in);
			br= new BufferedReader(in);
			num = Integer.parseInt(br.readLine());
			
		}
		
		
		catch(Exception e){
			
			System.out.println("your code went wrong" + e);
			
			
		}
		
		// finally key can be used with try
		// it just runs if any way it u r code is under a exception
		
		// is mainy use dto close the resource 
		
		finally {
			
			
			//we can close the bufferedReader resource opened above in finally
			
			if(br!=null) {
				try {
					br.close();
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
			System.out.println("bye");
		}

	}

}
