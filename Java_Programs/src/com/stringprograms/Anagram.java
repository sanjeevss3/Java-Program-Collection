/**
* Auther: Sanjeev Chaudhary
* Date: 15 Jan 2025
*/

package com.stringprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Sanjeev";
		String str2 = "sanjeev";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Given strings are not Anagram");
		} else {
			char[] str3 = str1.toCharArray();
			char[] str4 = str2.toCharArray();
			Arrays.sort(str3);
			Arrays.sort(str4);
			boolean result = Arrays.equals(str3, str4);
			if (result == true) {
				System.out.println("Given string is Anagram");
			} else {
				System.out.println("Given string is NOT Anagram");
			}
		}

	}

}
