import  java.util.Scanner;

public class Average {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int n;
	double average = 0;
	double sum = 0;
	
	
	System.out.println("Enter a maximum for the average");
	n = scnr.nextInt();
	
	for (int i = 1; i <= n; i++) {
		sum = sum + i;
	}
	average = sum / n;
	
	System.out.println("The average = " + average);
	
	

}
}
