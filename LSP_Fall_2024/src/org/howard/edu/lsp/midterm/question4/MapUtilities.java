package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

	/**
	 * This utility class provides methods to determine the number of common key-value pairs between two HashMaps.
	 */
	public class MapUtilities {

	    // Return the number of common key-value pairs between two HashMaps
	    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
	        if (map1.isEmpty() || map2.isEmpty()) return 0;

	        int commonCount = 0;
	        for (String key : map1.keySet()) {
	            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
	                commonCount++;
	            }
	        }
	        return commonCount;
	    }
	}
