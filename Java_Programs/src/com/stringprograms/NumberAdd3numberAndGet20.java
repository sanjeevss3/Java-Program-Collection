/**
* Auther: Sanjeev Chaudhary
* Date: 1 Dec 2024
*/

/**
 * 
 */
package com.stringprograms;

public class NumberAdd3numberAndGet20 {
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 0; i < num.length - 2; i++) {
			for (int j = i + 1; j < num.length - 1; j++) {
				for (int k = j + 1; k < num.length; k++) {
					if (num[i] + num[j] + num[k] == 20) {
						System.out.println(num[i] + ", " + num[j] + ", " + num[k]);
					}
				}
			}
		}
	}
}