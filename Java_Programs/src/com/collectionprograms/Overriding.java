package com.collectionprograms;

class SuperClass {
	void sum(int a, int b) {
		System.out.println("SuperClass-Sum of a and b= " + (a + b));
	}
}

class SubClass extends SuperClass {
	void sum(int a, int b) {
		System.out.println("SubClass-Sum of a and b= " + (a + b));
	}
}

public class Overriding {
	public static void main(String[] args) {
		SuperClass obj1 = new SuperClass();
		obj1.sum(20, 30); // SuperClass sum(int a, int b) method is called.

		SuperClass obj2 = new SubClass();
		obj2.sum(40, 60); // SubClass sum(int a, int b) method is called.
	}
}
