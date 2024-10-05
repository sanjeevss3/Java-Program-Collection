package com.stringprograms;

import java.util.Scanner;

/**
*
* @author Sanjeev Chaudhary
* https://github.com/sanjeevss3/
*
*/

public class StringCountWordA3B2C4 {

	public static void main(String[] args) {

		String str = "AAABBCCDDD";
		
		System.out.println(compressString(str));

	}

	public static String compressString(String str) {
		
		StringBuilder compressstr = new StringBuilder();
		
		char currentChar=str.charAt(0);
		int count=1;
		
		for (int i = 1; i< str.length(); i++) {
			char nextChar=str.charAt(i);
			if(currentChar==nextChar) {
				count++;
			}else {
				compressstr.append(currentChar);
				compressstr.append(count);
				currentChar=nextChar;
				count=1;
			}
			
		}
		compressstr.append(currentChar);
		compressstr.append(count);
		//sc.close();
		return compressstr.toString();
	}
}
