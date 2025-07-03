package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class FindPrimeNumbersBetween1toNnumber {
	public static void main(String[] args) {
		{
			int num = 100; // Define the upper limit
			int count; // Initialize counter for divisibility checks

			// Iterate from 1 up to 'num' to identify prime numbers
			for (int i = 1; i <= num; i++) {
				count = 0; // Reset counter for each 'i'

				// Check for divisibility from 2 up to i/2
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++; // Increment if 'i' is divisible by 'j'
						break; // Exit loop if a divisor is found
					}
				}

				// If the count is 0, 'i' is prime
				if (count == 0) {
					System.out.print(i + " "); // Output the prime number
				}
			}
		}
	}
}