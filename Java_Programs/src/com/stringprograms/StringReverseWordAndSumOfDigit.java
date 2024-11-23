package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class StringReverseWordAndSumOfDigit {

	public static void main(String[] args) {

		String input = "Sa2nj4eev T5es6ter";

		String letters = input.replaceAll("[^a-zA-Z ]", "");
		System.out.println("letters::: " + letters);

		String digit = input.replaceAll("[^0-9 ]", "");
		System.out.println("digit::: " + digit);

		// Word reverse
		String[] words = letters.split(" ");
		// System.out.println(words[1] + " " + words[0]);
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		// Sum up the digits
		String[] numbers = digit.split(" ");

		// Parse the two numbers as integers
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);

		// Calculate the sum
		int sum = num1 + num2;
		System.out.println("\nSum of numbers: " + sum);

	}
}