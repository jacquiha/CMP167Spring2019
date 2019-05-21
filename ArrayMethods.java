
public class ArrayMethods {
	public static int sum(int[] arr, int firstIndex, int lastIndex) {
		int sum = 0;
		if ((firstIndex < 0) || (firstIndex > lastIndex) || (firstIndex > arr.length) || (lastIndex < 0) || (lastIndex > arr.length)) {
			return -666; }
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static double average(int[] arr, int firstIndex, int lastIndex) {
		double average = 0.0;
		double sum = 0.0;
		if ((firstIndex < 0) || (firstIndex > lastIndex) || (firstIndex > arr.length) || (lastIndex < 0) || (lastIndex > arr.length)) {
			return -666.0; }
		for (int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	
	public static int belowAverage(int[] arr, int firstIndex, int lastIndex) {
		int counter = 0;
		double average = 0.0;
		int sum = 0;
		if ((firstIndex < 0) || (firstIndex > lastIndex) || (firstIndex > arr.length) || (lastIndex < 0) || (lastIndex > arr.length)) {
			return -666; }
		for (int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
			average = sum/arr.length;
			if (arr[i] < average) counter++; 
	}
		return counter;
}
	public static int aboveAverage(int[] arr, int firstIndex, int lastIndex) {
		int counter = 0;
		double average = 0.0;
		for (int i=0; i < arr.length; i++) {
		average = average(arr, firstIndex, lastIndex);
		if (arr[i] > average) counter++;
		}
		if ((firstIndex < 0) || (firstIndex > lastIndex) || (firstIndex > arr.length) || (lastIndex < 0) || (lastIndex > arr.length)) {
			return -666; }
		return counter;
	}
	
}