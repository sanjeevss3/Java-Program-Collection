package collection.listconcept;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a class implements Map interface.
		// It contains only unique elements.
		// It store values in Key - Value pair
		// It may have one null key and multiple null values.
		// It maintains no order.
		//It is non-synchronized - Not thread safe.  Multiple thread can run at same time. 
		//Concurrent modification exception -- Fail -- Fast condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Java");
		hm.put(4, "TestNG");

		// Print value based on KEY
		System.out.println("\n*********Print Values using Key***************");
		System.out.println(hm.get(1));
		System.out.println(hm.get(5)); // Value is not there for Key 5 then it will print null.

		// Print values using Map.
		System.out.println("\n*********Print all Data - Keys and Values****************");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " --- " + m.getValue());
		}

		// Remove values based on KEY using remove()
		System.out.println("\n*********Print Values before and after remove using Key***************");
		System.out.println(hm); // Print all value
		hm.remove(4);
		System.out.println(hm); // Print value after removing KEY's value of 4.

		// Call Employee class
		System.out.println("\n*********Call Employee class and print Values***************");
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Tom", 25, "QA");
		Employee e2 = new Employee("Peter", 26, "Dev");
		Employee e3 = new Employee("Steve", 28, "Admin");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// Traverse the Map
		for (Map.Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee" +key + "-- Infomation\n");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
	}

}
