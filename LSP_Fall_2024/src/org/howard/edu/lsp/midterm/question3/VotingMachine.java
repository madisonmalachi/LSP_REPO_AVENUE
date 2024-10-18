



package org.howard.edu.lsp.midterm.question3;
/**
 * This class represents a simplified voting machine that keeps track of candidates and votes.
 * the source i use:  https://www.geeksforgeeks.org/java/
 
 */

import java.util.HashMap;

public class VotingMachine {
	private HashMap<String, Integer> candidates = new HashMap<>();

    // Add a candidate to the list
    public void addCandidate(String name) {
        candidates.put(name, 0);
    }

    // Cast a vote to the candidate with the specified name
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    // Override toString method to print out the number of votes each candidate has received
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String name : candidates.keySet()) {
            result.append(name).append(": ").append(candidates.get(name)).append(" votes\n");
        }
        return result.toString();
    }
}


	
	


