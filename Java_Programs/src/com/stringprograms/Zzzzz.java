package com.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Zzzzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the strting");
		String str = scanner.nextLine();

		String output = caseTitle(str);
		System.out.println(output);
	}

	public static String caseTitle(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		str = str.toLowerCase();
		return Character.toUpperCase(str.charAt(0)) + str.substring(1);
		// return Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}
}