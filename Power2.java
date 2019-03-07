/*
 * Jacqui Harari
 * 3.7.19
 * This program prints out the first nth power of two using for loop.
 */
import java.util.Scanner;

public class Power2 {

public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Welcome to Power");
	System.out.print("Enter a number to raise 2: ");
	int n = scnr.nextInt();
	int power = 1;

	
	for (int i = 1; i <= n; i++) {
		power = power *  2;
		System.out.println(power);
	}
	
}


}
