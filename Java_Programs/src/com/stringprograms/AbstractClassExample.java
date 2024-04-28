package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

abstract class AbstractClass {

	abstract void sum(int a, int b);

	abstract int sum1(int a, int b, int c);
}

class AbstractClassExample extends AbstractClass {

	void sum(int a, int b) {
		int c = a + b;
		System.out.println("Value of C: " + c);
	}

	int sum1(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Value of D: " + d);
		return d;
	}

	public static void main(String[] args) {
		AbstractClass obj = new AbstractClassExample();
		obj.sum(10, 20);
		obj.sum1(20, 40, 60);
	}
}