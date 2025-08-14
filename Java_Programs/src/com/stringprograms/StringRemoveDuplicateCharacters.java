package com.stringprograms;

public class StringRemoveDuplicateCharacters {

	public static void main(String[] args) {

		String input = "chaudhary";
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (result.indexOf(ch) == -1) { // if character not already in result
				result += ch;
			}
		}

		System.out.println("After removing duplicates: " + result);
	}
}