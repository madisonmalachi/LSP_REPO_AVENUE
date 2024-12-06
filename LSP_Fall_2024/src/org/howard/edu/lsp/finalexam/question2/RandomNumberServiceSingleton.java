package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton holder for the RandomNumberService.
 * Ensures only one instance is created throughout the lifetime of the application.
 */
public class RandomNumberServiceSingleton {
    
    private static RandomNumberService instance;
    
    /**
     * Returns the single instance of RandomNumberService.
     * 
     * @return the singleton instance.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

	public static RandomNumberService getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
