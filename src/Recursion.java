
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
static public long pow (int number, int power) {
	if (power < 0) {
		throw new IllegalArgumentException(" power can't be a negative");
	}
	if(number==0 && power==0) {
		throw new IllegalArgumentException(" 0^0 is undefined");
	}
	if(number==0 && power!=0) {
		return 0;
	}
	if (power == 0 && number != 0) {
		return 1;
	}
	if(number<0 && even(power)) {
		number = -number;
	}
	return multiply(number, pow(number,power - 1));
//	return number * pow(number, power - 1);
	//TODO according to the requirements 
	// Done
}

private static long multiply(int number, long power) {
	return power > 0 ? number + multiply(number, power - 1) : 0;
}
private static boolean even(int power) {
//	return power%2 == 0;
	if(power==1) {
		return false;
	} else if(power==0) {
		return true;
	}
	return even(power-2);
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
	// TODO 
	x =  Math.abs(x);
	if(x==1 || x==0) {
	   	return x;
	}
	// Explanation
	// x^2 = ((x-1)+1)^2 = (x-1)^2 +2*(x-1) +1 = (x-1)^2 +2x-2+1 = (x-1)^2 +2x -1
	return square(x - 1) + x + x - 1;
	 //Done
}  
// Another solution
public static int square1(int x) {
	return square1(0, Math.abs(x), 0);
}
private static int square1(int index, int x, int value) {
	return index < x ? square1(index+1, x, value+x) : value;
}
}
