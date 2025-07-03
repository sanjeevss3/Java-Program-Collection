package com.stringprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class FindPrimeNumbers {
	public static void main(String[] args) {
		int i, j, flag = 0;
		System.out.print("Enter any number which you want to verify whether it is a prime number or not :");
		Scanner s = new Scanner(System.in);
		j = s.nextInt();
		for (i = 2; i < j / 2; i++) {
			if (j % i == 0) {
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println(j + " is a prime number.");
		} else {
			System.out.println(+j + " is not a prime number.");
		}
	}
}
