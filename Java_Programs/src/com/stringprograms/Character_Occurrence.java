package com.stringprograms;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Character_Occurrence {

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str = sc.next();
		str = str.toLowerCase(); // converting the string into lowercase

		// int l = s.length(); // finding the length of the string

		System.out.println("Output:");
		System.out.println("=========================="); // this is just for styling the look of the output
		System.out.println("Alphabet\tFrequency");
		System.out.println("==========================");

		/* Counting frequency of alphabets begins below */
		char ch;
		int count;
		for (char i = 'a'; i <= 'z'; i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				ch = str.charAt(j); // extracting characters of the string one by one
				if (ch == i) { // first checking the whole string for 'a', then 'b' and so on
					count++; // increasing count of those aplhabets which are present in the string
				}
			}
			if (count != 0)// printing only those alphabets whose count is not '0'
			{
				System.out.println(i + "\t\t" + count);
			}
		}

	}

}
