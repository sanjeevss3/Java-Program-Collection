package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class PrimeNumbers3 {
	public static void main(String[] args) {

		int num = 30, count;
		System.out.println("Prime number between 10 to 30 are: ");
		for (int i = 10; i <= num; i++) {
			count = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.print(i + " ");
		}
	}
}
