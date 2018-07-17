package com.javaprograms;


/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SuperKeywordTutorial {

	public static void main(String[] args) {
		DerivedClass obj = new DerivedClass();
		obj.display();
	}

}


class SuperKeyword {

	int maxSpeed = 120;

	SuperKeyword() {
		System.out.println("Parent class constructor");
	}

	public void parentClassMethod() {
		System.out.println("Parent class method");
	}

}

class DerivedClass extends SuperKeyword {
	int maxSpeed = 200;

	public DerivedClass() {
		super();
		System.out.println("Chlild class constructor");
	}

	public void childClassMethod() {

		System.out.println("Child class method");
	}

	void display() {
		System.out.println("Calling Parent class data member: " + super.maxSpeed);
		System.out.println("Calling Child class data member: " + maxSpeed);
		super.parentClassMethod();
		childClassMethod();

	}

}
