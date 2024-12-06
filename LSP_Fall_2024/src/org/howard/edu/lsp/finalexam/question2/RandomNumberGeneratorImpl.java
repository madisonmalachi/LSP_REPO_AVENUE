package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Concrete implementation of RandomNumberGenerator using either Java's Random class or a Linear Congruential Generator (LCG).
 * The strategy is chosen based on the constructor argument.
 */
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {

    private Random random;
    private int seed;
    private final int a = 1664525;
    private final int c = 1013904223;
    private final int m = (1 << 32);

    /**
     * Constructor to initialize the appropriate random number generation strategy.
     * 
     * @param strategy the strategy to use ("java" for Random or "lcg" for Linear Congruential Generator).
     */
    public RandomNumberGeneratorImpl(String strategy) {
        if (strategy.equals("java")) {
            random = new Random();
        } else if (strategy.equals("lcg")) {
            // Default seed for LCG
            this.seed = 12345;
        } else {
            throw new IllegalArgumentException("Unknown strategy: " + strategy);
        }
    }

    /**
     * Generates a random number based on the chosen strategy.
     * 
     * @return a positive integer.
     */
    @Override
    public int generateRandomNumber() {
        if (random != null) {
            // Using Java's Random
            return random.nextInt(Integer.MAX_VALUE);
        } else {
            // Using Linear Congruential Generator (LCG)
            seed = (a * seed + c) % m;
            return Math.abs(seed);
        }
    }
}

