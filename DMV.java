/*
 * Jacqui Harari
 * 3.28.19
 * This program generates a driver's license and calculates its expiration date.
 */

package week9;
import java.util.Scanner;

public class DMV {
	public static Scanner scnr = new Scanner(System.in);
	public static void generateDL(int age, boolean testPass) {
	
	
	/* System.out.println("Welcome to the Driver's License generator!");
	System.out.println("Please enter your age: ");
	age = scnr.nextInt();
	System.out.println("Did you pass your test? (Y/N)");
	String answer = scnr.next();
	if (answer.equals("Y") || answer.equals("y")) {
		testPass = true;
	}
	else if (answer.equals("N") || (answer.equals("n"))) {
		testPass = false;
	}
	*/
		
	if (testPass && age >= 17) {
		System.out.println("Driver's License generated!");
	//	System.out.println("Your driver's license expires in " + expirationDate(2019));
	}
	else {
		System.out.println("Cannot generate Driver's License.");
	}
	}


	public static int expirationDate (int yearGenerated) {
		System.out.println("What year did you issue your license?");
		yearGenerated = scnr.nextInt();
		return (yearGenerated + 10);
	}
	
	
	public static void main(String[] args) {
		generateDL(17, true);
		System.out.print("Goodbye.");
}
}
