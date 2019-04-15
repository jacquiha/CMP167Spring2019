
public class Homework6Methods {
	 	 public static int getMaxOf2Ints (int a, int b) {
		 int max2 = 0;
	     if (a > b) a = max2;
	     else if (b > a) b = max2;
	     return max2;
	   }
	   public static int getMinOf2Ints(int a, int b) {
		   int min2=0;
	      if (a < b) a = min2;
	      else if (b < a) b=min2;
	      return min2;
	   }
	   public static int getMaxOf3Ints(int a, int b, int c) {
		   int max3 = 0;
	      if ((a > b) && (a > c)) a = max3;
	      else if ((b > a) && (b>c)) b = max3;
	      else if ((c>a) && (c > b)) c = max3;
	      return max3;
	   }
	   public static int getMedianOf3Ints(int a, int b, int c) {
		   int median3 = 0;
	      if ((a > b) && (a < c)) a=median3;
	      else if ((b > a) && (b < c)) b=median3;
	      else if ((c > a) && (c <  b))  c=median3;
	      return median3;
	   }
	   public static int printMinOf3Ints(int a, int b, int c) {
	      int minVal = 0;
	      if ((a < b) && (a < c) || ( a== b) && (a ==c))  minVal = a;
	      else if ((b < a) && (b < c))  minVal = b;
	      else if ((c < a) && (c < b))  minVal = c;
	      System.out.println("The min is " + minVal);
		return minVal;
	   }
	   public static int getProdOfAllPositiveInts(int a) {
	      if (a < 0) return 0;
	       int product = 1;
	      for (int i = 1; i <= a; ++i) {
	         product = product * i;
	      }
	      return product;
	   }
	   public static int getProdOfAllNegativeInts(int a) {
		   int product = 1;
	      if (a >= 0) return 0;
	      for (int i= -1; i <= a; ++i) {
	         product = product * i;
	      }
	      return product;
	   }
	   public static boolean isProdOfAllNegativeIntsNegative(int a) {
	      int product = 1;
	   for (int i= -1; i >= a; --i) {
	         product = product * i;
	      }
	      if (product < 0) return true;
	      else return false;
	   }
	   public static char getCharAtIndex(String s, int index) {
		  if ((index >= 0) && (index < (s.length()))) {
			  char userChar = s.charAt(index) ;
			  return userChar;
		  }
	      else return '?';
	   }
	   public static int getCountOfCharInString (String s, char c) {
	        int numchar = 0;
	      for (int i = 0; i < s.length() -1; ++i) {
	         if(s.charAt(i) == c) {
	            ++numchar;
	         }
	      }
	      return numchar;
	   }
	   public static String getStringReversed(String s) {
	      String reverse = " ";
	      for (int i = s.length() - 1; i >= 0; i--) {
	         reverse = reverse + (s.charAt(i));
	      }
	      return reverse;
	   }
	   public static String getStringTitleCased(String s) {
	         if (s.length() == 0) return s;
	         else {
	            s = s.substring(0,1).toUpperCase() + s.substring(1);
	            for (int i= 1; i < s.length(); ++i) {
	              if (Character.isWhitespace(s.charAt(i-1))) {
	              s = s.substring(0,1) + s.substring(i, i+1).toLowerCase() + s.substring(i+1);
	            }
	            }
	            return s;
	         }
	   }    
	   
	}

	
