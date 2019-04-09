package week11;

public class CalculateArray {
public static int sumList(int[] array) {
	int sum = 0;
	for (int i= 0; i <= array.length-1; ++i) {
		sum = sum + array[i];
	}
	return sum;
}

public static double averageList(int[] array) {
	double average = 0;
	int sum =0;
	for (int i = 0; i <=array.length - 1; ++i) {
		 sum = sum + array[i];
		 average = sum / array[i];
	}
	return average;
}
public static void main(String[] args) {
	int [] array = {1, 2, 3, 4};
	System.out.println("The sum of the array is: " + sumList(array));
	System.out.println("The average of the array is: " + averageList(array));
	System.out.println("The number of odd elements in the array is: " + oddElements(array));
}
public static int oddElements(int [] array) {
	int amountOdd = 0;
	for (int i = 0; i <= array.length - 1; ++i) {
		if (array[i] % 2 == 0) {
			continue;
		}
		else amountOdd += 1;
	}
	return amountOdd;
}
}
