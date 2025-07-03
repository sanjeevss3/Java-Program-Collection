package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/ 121
 */

public class PliandromeString {
	public static void main(String[] args) {

		String str = "jaJ".toLowerCase();
		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}

		if (str.equals(str1)) {
			System.out.println("Given string is plaindrome::- " + str1);
		} else {
			System.out.println("Given string is NOT plaindrome::- " + str1);
		}
	}
}