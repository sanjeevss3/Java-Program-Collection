package collection.listconcept;

import java.util.ArrayList;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/


//ArrayList is a dynamic arry.
//ArrayList can contain duplicate values/elements
//It maintain insertion order.
//It is not synchronized (not thread safe).
//Allows random access to fetch the element because it stores the values on the basis of indexes. 

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		int a[]=new int[3]; //It is static array, Size is fixed. 
		
		ArrayList arr=new ArrayList<>();
		
		arr.add(10); //0th index
		arr.add(20); //1
		arr.add(30); //2
		arr.add(30); //3
		arr.add(40); //4
		arr.add("Test");
		arr.add('c');
		arr.add(12.3);
		System.out.println("Size of ArrayList: " +arr.size()); //Find size of ArrayList.
		System.out.println("Values from index3: " +arr.get(3)); //To the value from an index. 
		
		//To print all values from ArrayList, we can use below two thing:
		//1. for loop
		//2. using iterator
		
		for(int i=0;i<arr.size(); i++) {
			System.out.println("Values of ArrayList: " +arr.get(i));
		}
		
		//non-generic vs generic:
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(30);
		// arr1.add("Selenium"); //String type are not allowed since ArrayList is declared as Integer type
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Test");
		arr2.add("Selenium");
		
		//If you are not sure which data type are going to use at run time of program then follow the below type ArrayList.
		// This concept is called generic.
		
		ArrayList<E> arr3=new ArrayList<E>();
		
	}

}
