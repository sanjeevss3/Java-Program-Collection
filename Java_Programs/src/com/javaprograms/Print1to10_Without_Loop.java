package com.javaprograms;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class Print1to10_Without_Loop {

	public static void recursivefun(int n) {

		if (n <= 10) {

			System.out.println(n);
			recursivefun(n + 1);
		}
	}

	public static void main(String args[]) {

		recursivefun(1);

	}

}
