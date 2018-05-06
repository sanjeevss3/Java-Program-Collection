package com.javaprograms;

import java.util.Scanner;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n, temp, sum = 0;
		System.out.println("Please Enter the number to check Armstrong: ");
		Scanner n1 = new Scanner(System.in);
		n = n1.nextInt();

		int num = n;
		
		while (n > 0) {
			temp = n % 10;
			n = n / 10;
			sum = sum + (temp * temp * temp);
		}

		if (num == sum) {
			System.out.println("Number is Armstrong: " + num);
		} else {
			System.out.println("Number is not Armstrong: " + num);
		}

	}

}
