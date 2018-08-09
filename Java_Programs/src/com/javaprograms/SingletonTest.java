package com.javaprograms;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

class Singleton {
	public static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}

public class SingletonTest {

	public static void main(String args[]) {
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println("This is an example of Singleton class");
	}
}