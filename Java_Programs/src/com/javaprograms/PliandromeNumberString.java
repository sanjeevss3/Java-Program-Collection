package com.javaprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/ 121
 */

public class PliandromeNumberString {
	public static void main(String[] args) {
		
		int r, sum = 0, temp;
		System.out.println("Enter number to check palindrome");
		Scanner n1=new Scanner(System.in);
		int n=n1.nextInt();
		
	//	int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Number is palindrome: "+temp);
		else
			System.out.println("Number is not palindrome: "+temp);
	}
	/*
	 * String original, reverse = ""; // Objects of String class
	 * 
	 * Scanner in = new Scanner(System.in);
	 * System.out.println("Enter a string/number to check if it is a palindrome");
	 * original = in.nextLine();
	 * 
	 * int length = original.length();
	 * 
	 * for (int i = length - 1; i >= 0; i--) reverse = reverse + original.charAt(i);
	 * if (original.equals(reverse))
	 * System.out.println("Entered string/number is a palindrome."); else
	 * System.out.println("Entered string/number isn't a palindrome.");
	 */

}
