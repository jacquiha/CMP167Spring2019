package homework5;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String resetCalc = "Y";
		
		while (((resetCalc.equals("Y")) || (resetCalc.equals("y")))) {

			String calcMode;
			int numAmount;
			double finalResult = 0;
			String operation = "+";
			
			
		System.out.println("Enter the calculator mode: Standard/Scientific?");
			calcMode = scnr.next();
	
		if (calcMode.equals("Scientific") || (calcMode.equals("scientific"))) {
			System.out.println("The calculator will operate in scientific mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, "
				+ "'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
			operation = scnr.next();
		}
		if (calcMode.equals("Standard") || (calcMode.equals("standard"))) {
			System.out.println("The calculator will operate in standard mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division:");
			operation = scnr.next();
			if (!operation.equals("+") && (!operation.equals("-")) && (!operation.equals("*")) && (!operation.equals("/"))) {
					System.out.println("Invalid operation entered");
					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division:");
					operation = scnr.next();
			}
		}
		
		String operatorType = "add";
		switch (operation) {
		case "+":
			operatorType = "add";
			break;
		case "-":
			operatorType = "subtract";
			break;
		case "*":
			operatorType = "multiply";
			break;
		case "/": 
			operatorType = "divide";
			break;
		case "sin":
			operatorType = "sine";
			break;
		case "cos":
			operatorType = "cosine";
			break;
		case "tan":
			operatorType = "tangent";
			break;
		}
		
	
		
	if (!operation.equals("sin") && !operation.equals("cos") && !operation.equals("tan")) {
		System.out.println("How many numbers do you want to " + operatorType + "?");
		numAmount = scnr.nextInt();
		System.out.println("Enter " + numAmount + " numbers");
		
			if (operation.equals("+")) {
					double sum = 0;
					for (int i = 0; i < numAmount; i++) {
						double inputOne = scnr.nextDouble();
						sum = sum + inputOne; 
						 finalResult = sum;
						}
		}
				
	
			if (operation.equals("-")) {
					if (numAmount == 2) {
						double input1 = scnr.nextDouble();
						double input2 = scnr.nextDouble();
						double difference = input1 - input2;
						 finalResult = difference;
					}
					else if (numAmount != 2) {
						double input1 = scnr.nextDouble();
						double input2 = scnr.nextDouble();
						double difference = input1 - input2;
						for (int i = 0; i < (numAmount - 2); i++) {
							double input3 = scnr.nextDouble();
							 finalResult = difference - input3;
						}
					}
		}
			 if (operation.equals("*")) {
					 numAmount = scnr.nextInt();
				double product = 1.0;
				for (int i = 0; i <= numAmount; i++) {
					double inputOne = scnr.nextDouble();
					product = product * inputOne;
					finalResult = product;
					}
				 
			}
			 if (operation.equals("/")) {
					 numAmount = scnr.nextInt();
				if (numAmount == 2) {
					double input1 = scnr.nextDouble();
					double input2 = scnr.nextDouble();
					double quotient = input1 / input2;
					 finalResult = quotient;
				}
				else if (numAmount != 2) {
					double input1 = scnr.nextDouble();
					double input2 = scnr.nextDouble();
					double quotient = input1 / input2;
					for (int i = 0; i < (numAmount - 2); i++) {
						double input3 = scnr.nextDouble();
						finalResult = quotient / input3;
					}
				}
			 
			}
			 if (operation.equals("sine")) {
					double radians = scnr.nextDouble();
					double sin = Math.sin(radians); 
					 finalResult = sin;
					
			 }
			 if (operation.equals("cosine")) {
					double radians = scnr.nextDouble();
					double cos = Math.cos(radians); 
					 finalResult = cos;
			 }
			else if (operation.equals("tangent")) {
					double radians = scnr.nextDouble();
					double tan = Math.sin(radians); 
					finalResult = tan;
			}
		}
	
	System.out.println("Result: " + finalResult);
		System.out.println("Do you want to start over? (Y/N)");
		resetCalc = scnr.next(); 
		if (resetCalc.equals("N") || (resetCalc.equals("n"))) {	
			System.out.println("Goodbye");
		}
	}
}
}
