package org.howard.edu.lsp.finalexam.question2;



/**
 * Client program to demonstrate the use of different random number generation strategies.
 */
public class RandomNumberClient {

    /**
     * Main method to execute the client program and generate random numbers using different strategies.
     * 
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberServiceSingleton.getInstance();

        // Use Java's built-in Random strategy
        service.setRandomNumberGenerator(new RandomNumberGeneratorImpl("java"));
        System.out.println("Random number using Java's Random: " + service.generateRandomNumber());

        // Use Linear Congruential Generator strategy
        service.setRandomNumberGenerator(new RandomNumberGeneratorImpl("lcg"));
        System.out.println("Random number using LCG: " + service.generateRandomNumber());
    }
}
