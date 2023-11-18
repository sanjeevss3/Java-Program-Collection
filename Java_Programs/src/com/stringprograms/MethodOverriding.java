package com.stringprograms;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

class A {
	public void method1() {
		System.out.println("method1 called");
	}
}

class B extends A {
	public void method1() {
		System.out.println("Method2 Called");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		B obj = new B();
		obj.method1();
		A obj1=new B();
		obj1.method1();

	}

}
