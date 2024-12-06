package org.howard.edu.lsp.finalexam.question1;

/**
 * For help with this problem these are the sources I used: https://www.geeksforgeeks.org/how-to-solve-illegalargumentexception-in-java/
 *https://www.w3schools.com/Java/java_strings_concat.asp
 *https://www.geeksforgeeks.org/introduction-to-junit-5/ 
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();

    // Test cases for the factorial method
    @Test
    void factorial_ShouldReturn1_ForZero() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    void factorial_ShouldReturnCorrectFactorial_ForPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5)); // 5! = 120
    }

    @Test
    void factorial_ShouldThrowException_ForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    // Test cases for the isPrime method
    @Test
    void isPrime_ShouldReturnFalse_ForNumbersLessThanOrEqualToOne() {
        assertFalse(mathUtils.isPrime(0));
        assertFalse(mathUtils.isPrime(1));
        assertFalse(mathUtils.isPrime(-5));
    }

    @Test
    void isPrime_ShouldReturnTrue_ForPrimeNumbers() {
        assertTrue(mathUtils.isPrime(2)); // 2 is a prime number
        assertTrue(mathUtils.isPrime(13)); // 13 is a prime number
    }

    @Test
    void isPrime_ShouldReturnFalse_ForNonPrimeNumbers() {
        assertFalse(mathUtils.isPrime(4)); // 4 is not a prime number
        assertFalse(mathUtils.isPrime(100)); // 100 is not a prime number
    }

    // Test cases for the gcd method
    @Test
    void gcd_ShouldReturnGcd_ForPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24)); // gcd of 54 and 24 is 6
    }

    @Test
    void gcd_ShouldReturnAbsoluteValue_WhenOneNumberIsZero() {
        assertEquals(10, mathUtils.gcd(10, 0));
        assertEquals(10, mathUtils.gcd(0, 10));
    }

    @Test
    void gcd_ShouldThrowException_WhenBothNumbersAreZero() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}
