package com.stringprograms;

import java.util.regex.Pattern;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ReverseWords {

	public static void main(String[] args) {

		// This code to reverse the string.
		String str = "Sanjeev Kumar Chaudhary";
		for (int i = str.length() - 1; i >= 0; i--) {
			// System.out.print(str.charAt(i));
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
//==========================================================================================

		// This code is for to reverse the word of a sentence.
		String s[] = "I stay in Bangalore".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println(ans);
	}

}
