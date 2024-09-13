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
		HashMap<String, Integer>WordCountHash = new HashMap<String, Integer>();
		String filePath = "src/org/howard/edu/lsp/assignment2/words.text";
		
		try {
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				line = line.toLowerCase();
				String[] words = line.split("[^a-z]+");
				
				for (String word: words) {
					if(!word.isEmpty() && word.length() > 3) {
						WordCountHash.put(word, WordCountHash.getOrDefault(word, 0) +1);
						
					}
				}
			}
		
		scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
		System.out.println(WordCountHash);
		// TODO Auto-generated method stub

	}

}
