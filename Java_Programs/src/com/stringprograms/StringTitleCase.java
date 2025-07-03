/**
* Auther: Sanjeev Chaudhary
* Date: 3 Jul 2025
*/

package com.stringprograms;

import java.util.Scanner;

public class StringTitleCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input string
		System.out.print("Enter a name: ");
		String input = scanner.nextLine();

		// Convert to title case
		String output = toTitleCase(input);

		System.out.println("Title Case: " + output);
		scanner.close();
	}

	// Method to convert string to title case
	public static String toTitleCase(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		str = str.toLowerCase(); // Convert entire string to lowercase
		return Character.toUpperCase(str.charAt(0)) + str.substring(1); // Capitalize first character
	}
}
