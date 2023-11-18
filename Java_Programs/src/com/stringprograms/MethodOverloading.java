package com.stringprograms;


/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class MethodOverloading {
	
	public void method1() {
		System.out.println("Method1");
	}
	
	public void method1(int x) {
		int a=x;
		System.out.println("X value= "+a);
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.method1();
		obj.method1(30);
	}

}
