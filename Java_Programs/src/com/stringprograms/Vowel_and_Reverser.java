package com.stringprograms;

import java.util.Scanner;

import javax.print.attribute.standard.Copies;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Vowel_and_Reverser {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = in.nextLine();

		System.out.print("Number of  Vowels in the string: " + count_Vowels(str) + "\n");
	}

	public static int count_Vowels(String str) {
		int count = 0;
		char str1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
				System.out.print(str.charAt(i));
				str1 = str.charAt(i);
			}
		}
		System.out.println("\n");
		return count;
	}
}
