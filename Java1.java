package java_from_0;

// to get print to console and get input 

// class for i/p & o/p
import java.util.Scanner;

public class Java1 {
	// main class where jvm know to start the program
	public static void main(String[] args) {
		
		System.out.println("This line to print out ");
		
		//to get input from the users
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the input");
		int number = sc.nextInt();
		
		System.out.println("number from the user" + number);
		
		

	}

}
