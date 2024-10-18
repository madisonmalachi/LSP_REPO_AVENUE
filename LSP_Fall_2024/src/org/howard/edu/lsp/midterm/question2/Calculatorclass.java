package org.howard.edu.lsp.midterm.question2;

/** utility class provides methods to sum numbers of different types.
 * the source: https://www.geeksforgeeks.org/java/
 */

public class Calculatorclass {
	// sum of two integers 
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	// sum of two double values 
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	// the sum of all elements in the array
	public static int sum(int[] nums) {
		int total = 0;
		for (int num: nums) {
			total += num;
			
		}
		return total;
	}
}
