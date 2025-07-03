package com.stringprograms;

import java.util.HashMap;

public class StringEachCharacterDigitOccuranceCount {

	public static void main(String[] args) {
		// The input string
		String input = "sanjeev1 234 kumar 23 chaudhary";

		// Create a HashMap to store the frequency of characters and digits
		HashMap<Character, Integer> charCount = new HashMap<>();

		// Iterate through the string
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			// Check if the character is a letter or digit
			if (Character.isLetterOrDigit(ch)) {
				// If character is already in the map, increment its count
				charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
			}
		}

		// Output the character and digit counts
		System.out.println("Character and digit counts:");
		for (char key : charCount.keySet()) {
			System.out.println(key + ": " + charCount.get(key));
		}
	}
}
