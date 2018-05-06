package com.javaprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public final class Zzzzz {

	public static void main(String[] args) {
		String str = "Sanjeev Chaudhary";

		str = str + " ";
		int length = str.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
			System.out.println("No. of words: " + count);
		}
	}
}