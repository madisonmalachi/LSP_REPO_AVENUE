/*
 * Name: Madison Malachi
 */


package org.howard.edu.lsp.assignment2;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounters {

	public static void main(String[] args) {
		HashMap<String, Integer>WordCountHash = new HashMap<String, Integer>(); // creating a hashmap to store the words as keys and values
		String filePath = "src/org/howard/edu/lsp/assignment2/words.text"; // the file path to where the text file is located 
		
		try {
			File file = new File(filePath);  // creating a file object using a certain path
			Scanner scanner = new Scanner(file); // the scanner then reads the file
			
			// looping through each line in the file 
			while (scanner.hasNext()) {
				String line = scanner.nextLine(); // read the next line within the file
				line = line.toLowerCase(); // convert everything to lowercase
				String[] words = line.split("[^a-z]+"); // split everything into words using regular expression
				
				// loop through every word in the array
				for (String word: words) {
					if(!word.isEmpty() && word.length() > 3) {
						WordCountHash.put(word, WordCountHash.getOrDefault(word, 0) +1);
						// if the word is not empty and has more than 3 characters than continue 
						// add to the hashmap and increase by one depending on how many times the word shows up
					}
				}
			}
		
		scanner.close(); // close the scanner after reading the file 
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage()); // if there is no file print an error message
		}
		System.out.println(WordCountHash); // then print out the contents of the hashmap
		// TODO Auto-generated method stub

	}

}
