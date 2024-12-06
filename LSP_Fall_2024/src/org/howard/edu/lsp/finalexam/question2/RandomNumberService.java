package org.howard.edu.lsp.finalexam.question2;

/**
 * Service class that provides random number generation using different strategies.
 * Implements the Singleton pattern to ensure only one instance is created.
 */
public class RandomNumberService {
    
    private RandomNumberGenerator randomNumberGenerator;
    
    /**
     * Private constructor to prevent external instantiation.
     */
    RandomNumberService() {
        // Default strategy, could be changed later
        this.randomNumberGenerator = new RandomNumberGeneratorImpl("java");
    }
    
    /**
     * Sets the strategy for random number generation.
     * 
     * @param randomNumberGenerator the strategy to use.
     */
    public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    /**
     * Generates a random number using the current strategy.
     * 
     * @return the generated random number.
     */
    public int generateRandomNumber() {
        return randomNumberGenerator.generateRandomNumber();
    }
}
