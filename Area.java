package week7;
import java.util.Scanner;
/* 
 * Author: Jacqui Harari
 * Area.java
 * This program implements area functions/method.
 * Created 3.14
 */

public class Area {
	static Scanner scnr = new Scanner(System.in);
	/* 
	 * getRectArea: int
	 * params: width: int, length: int
	 * Calculates rectangle area
	 */

		public static int getRectArea(int width, int length) {
			return width * length;
			
		}
		
		public static void rectArea() {
			int width, length, area;
			System.out.println("Let's calculate rectangle area");
			System.out.println("Enter width: ");
			width = scnr.nextInt();
			System.out.println("Enter length: ");
			length = scnr.nextInt();
			// process/calculation
			area = width * length;
			//output
			System.out.println("The rect area is: " + area);
		}
		
		public static void triArea() {
			double base, height, area;
			System.out.println("Let's calculate triangle area: ");
			System.out.println("Enter base length: ");
			base = scnr.nextDouble();
			System.out.println("Enter height length: ");
			height = scnr.nextDouble();
			// process/calculation
			area = (0.5) * base * height;
			//output
			System.out.println("The triangle area is " + area);
		}
		
		public static void circArea() {
			double radius, area;
			System.out.println("Let's calculate the area of a circle");
			System.out.println("Enter radius: ");
			radius = scnr.nextDouble();
			area = Math.PI * radius * radius;
			System.out.println("The circle area is: " + area);
		}
		
		public static void main(String[] args) {
			rectArea(); //Function call
			circArea();
			triArea();
			System.out.println("Ener width and length: ");
			int width = scnr.nextInt();
			int length = scnr.nextInt();
			int area = getRectArea(width, length);
			
			System.out.println("Area: " + area);
		}
		

}
