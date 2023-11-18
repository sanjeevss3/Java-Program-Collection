package com.collectionprograms;


/* (1.) Method overloading is concept where two or more methods have the same name but 
different arguments/parameters.

(2.) Method Overloading is performed within a class.

(3.) Private, Static and Final method can be overloaded. */



public class Overloading {
	void sum(int a, int b) {
		System.out.println("sum of a and b= " + (a + b));
	}

	void sum(float c, float d) {
		System.out.println("sum of c and d= " + (c + d));
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.sum(10, 20); // sum(int a, int b) method is called.
		obj.sum(10.6f, 20.4f); // sum(float c, float d) method is called.
	}
}
