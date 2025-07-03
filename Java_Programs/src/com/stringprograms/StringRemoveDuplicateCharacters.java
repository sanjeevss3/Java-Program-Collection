package com.stringprograms;

public class StringRemoveDuplicateCharacters {

	public static void main(String[] args) {

		String input = "abcabcbb";
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (!result.contains(String.valueOf(input.charAt(i)))) {
				result += String.valueOf(input.charAt(i));
			}
		}
		System.out.println(result);
	}

}
