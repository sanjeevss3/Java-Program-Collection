package collection.listconcept;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

// ArrayList is a dynamic arry.
// ArrayList can contain duplicate values/elements
// It maintain insertion order.
// It is not synchronized (not thread safe).
// Allows random access to fetch the element because it stores the values on the
// basis of indexes.

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		int a[] = new int[3]; // It is static array, Size is fixed.

		// 1. How to declare and define ArrayList and print its Values:

		ArrayList arr = new ArrayList<>();
		arr.add(10); // 0th index
		arr.add(20); // 1
		arr.add(30); // 2
		arr.add(30); // 3
		arr.add(40); // 4
		arr.add("Test");
		arr.add('c');
		arr.add(12.3);
		System.out.println("Size of ArrayList: " + arr.size()); // Find size of ArrayList.
		System.out.println("Values from index3: " + arr.get(3)); // To the value from an index.

		// To print all values from ArrayList, we can use below two thing:
		// 1. for loop
		// 2. using iterator

		for (int i = 0; i < arr.size(); i++) {
			System.out.println("Values of ArrayList: " + arr.get(i));
		}

		System.out.println("**********************************************************\n");

		// 2. non-generic vs generic:

		System.out.println("generic Vs non-generic");

		// Example of Generic Collection.
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(30);
		// arr1.add("Selenium"); //String type are not allowed since ArrayList is
		// declared as Integer type

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Test");
		arr2.add("Selenium");

		System.out.println("\n");

		// Example of Non-Generic Collection.
		// If you are not sure which data type are going to use at run time of program
		// then follow the below type ArrayList.
		ArrayList arr7 = new ArrayList<>();
		arr7.add(10); // 0th index
		arr7.add(20); // 1
		arr7.add("Test");
		arr7.add('c');
		arr7.add(12.3);

		// 3. This is another way to declare the ArrayList if you are not aware about
		// Datatype.
		ArrayList<E> arr3 = new ArrayList<E>();

		System.out.println("**********************************************************\n");

		// 4. Call User defined datatypes.
		// Employee Class Object

		Employee e1 = new Employee("Sanjeev", 28, "QA");
		Employee e2 = new Employee("Vinay", 29, "Dev");
		Employee e3 = new Employee("Sathish", 30, "Admin");

		// Create ArrayList
		ArrayList<Employee> arr4 = new ArrayList<Employee>();
		arr4.add(e1);
		arr4.add(e2);
		arr4.add(e3);

		// Itrator to traverse values: Here we can not use for look because Itrator does
		// not work based on Indexes.
		Iterator<Employee> empit = arr4.iterator();
		while (empit.hasNext()) {
			Employee emp = empit.next();
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Age:  " + emp.age);
			System.out.println("Employee Department:  " + emp.dept);
			System.out.println("\n");

		}

		System.out.println("**********************************************************\n");

		// 5. addAll() & removeAll() & retainAll methods
		ArrayList<String> arr5 = new ArrayList<String>();
		arr5.add("Selenium");
		arr5.add("QTP");
		arr5.add("TestNG");

		ArrayList<String> arr6 = new ArrayList<String>();
		arr6.add("Java");
		arr6.add("Jenkins");
		arr6.add("TestNG");

		arr5.addAll(arr6); // addAll()

		for (int i = 0; i < arr5.size(); i++) {
			System.out.println(arr5.get(i));
		}
		
		
		System.out.println("------------------------------------------------------------\n");

		arr5.retainAll(arr6); // retainAll()
		for (int i = 0; i < arr5.size(); i++) {
			System.out.println("RetainAll methods data: " +arr5.get(i));
		}


		System.out.println("------------------------------------------------------------\n");

		arr5.removeAll(arr6); // removeAll()
		for (int i = 0; i < arr5.size(); i++) {
			System.out.println(arr5.get(i));

			
		}
	}

}
