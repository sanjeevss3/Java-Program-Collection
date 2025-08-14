package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class StringCountWordA3B2C4 {

	public static void main(String[] args) {
		String str = "AAABBCCDDD";

		int count;
		for (char i = 'A'; i <= 'Z'; i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.print(i + "" + count);
			}
		}
	}
}