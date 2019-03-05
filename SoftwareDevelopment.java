package week6;

import java.util.Scanner;

public class SoftwareDevelopment {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	int n;
	int sum = 0;
	
	System.out.println("Enter number of natural numbers: "); 
		n = scnr.nextInt();
		
	while (n >= 1) {
		sum = sum + n + (n - 1);
		n = n - 2;
	}
	System.out.println("The sum is " + sum);
}
}
