/**
* Auther: Sanjeev Chaudhary
* Date: 26 Dec 2024
*/

/**
 * 
 */
package com.stringprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsAndThrowExceptions {

	// Method that throws an exception
	public static void readFile(String filename) throws IOException {
		if (filename == null) {
			throw new NullPointerException("Filename cannot be null"); // throw an exception
		}

		FileReader file = new FileReader(filename); // This line can throw IOException
		BufferedReader reader = new BufferedReader(file);
		System.out.println(reader.readLine());
		reader.close();
	}

	public static void main(String[] args) {
		try {
			readFile(null); // This will throw a NullPointerException
		} catch (NullPointerException | IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
