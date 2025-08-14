/**
* Auther: Sanjeev Chaudhary
* Date: 4 Aug 2025
*/

package com.collectionprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		int[] n = new int[10];
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			n[i] = read.nextInt();
			if (n[i] % 2 == 0) {
				even.add(n[i]);
			} else {
				odd.add(n[i]);
			}
		}
		System.out.println("Even numbers are: ");
		for (int e : even) {
			System.out.print(e);
		}

		System.out.println("Odd numbers are: ");
		for (int o : odd) {
			System.out.print(o);
		}
	}
}