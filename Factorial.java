import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	int n;
	int factorial = 1;
	
	System.out.println("Welcome to Factorial!");
	System.out.print("Enter a value of n: ");
	n= scnr.nextInt();
	
	for (int i = 1; i <= n; i++) {
		factorial = factorial * i;
		System.out.println("n factorial = " + factorial);
	
	}
	
	
	
	
	}
}

