
public class Recursion {
static public long factorial(int n) {
	if (n < 0) {
		throw new IllegalArgumentException(" number can't be a negative");
	}
	if (n <= 1) {
		return 1;
	}
	return n * factorial(n - 1);
}
/**
 * 
 * @param a - any number (positive or negative)
 * @param b - any positive number or zero (throwing IllegalArgumentException in the case b < 0)
 * @return a ^ b
 * requirements:
 * 1. No cycles
 *  
 * 2. Only  arithmetic operations either + or -
 * 3. Additional methods (no standard) should apply the #1 and #2 requirements
 * 4. No additional static field
 */
static public long pow (int a, int b) {
//	if (b < 0) {
//		throw new IllegalArgumentException(" power can't be a negative");
//	}
//	if (b == 0) {
//		return 1;
//	}
//	return a * pow(a, b - 1);
	//TODO according to the requirements 
	return 0;
}

/**
 * 
 * @param array
 * @return sum of the array's elements 
 * requirements:
 * 1. No cycles;
 * 2. Additional methods should apply the requirement #1
 */
static public long sum(int[] array) {
	return sum(0, array);
}
private static long sum(int firstIndex, int[] array) {
	return firstIndex < array.length ? array[firstIndex] + sum(firstIndex + 1, array) : 0;
}
/**
 * 
 * @param x
 * @return x ^ 2
 * 1. No cycles
 * 2. Allowed only operators + or -
 * 3. No additional methods
 * 4. No static fields
 */
public static int square(int x) {
	// TODO Auto-generated method stub
	return 0;
}
}
