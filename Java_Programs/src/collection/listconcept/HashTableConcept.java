package collection.listconcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class HashTableConcept {

	public static void main(String[] args) {
		// It is simillar to HashMap but its synchronized.
		// Store the value of the basis of key-val
		// key --> Object -- HashCode --> Value

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Peter");
		h1.put(3, "Steve");

		// Create a clone copy/shallow copy
		System.out.println("***Hashtable provide machinish to Clone the value in another Object of Hastable***");

		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		System.out.println("Values form h1:  " + h1);
		System.out.println("Values from h2:  " + h2);

		h1.clear(); // it will clear the all values stored in h1.
		System.out.println("\nValues form h1:  " + h1);
		System.out.println("Values from h2:  " + h2);

		// Contains method
		System.out.println("\n****************How to use contains methods and print the values***************");
		Hashtable st = new Hashtable();
		st.put("A", "Sanjeev");
		st.put("B", "QA");
		st.put("C", "Selenium");

		if (st.containsValue("Sanjeev")) {
			System.out.println("\nValues is present:  " + st.get("A"));
		}

		// Print all values from Hashtable using -- Enumerator -- elements()
		System.out.println("\n******Print all values from Hashtable using -- Enumerator -- elements()*****");
		Enumeration e = st.elements();
		System.out.println("1. Print values from st using Enumerator:---");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// Get all values from Hashtable using -entrySet() --set of Hashtable values:
		System.out.println("\n2. Print values from st using entrySet():---");

		Set s = st.entrySet();
		System.out.println(s);

		// Check both Hashtables are equal or not
		System.out.println("\n*********Check both Hashtables are equal or not using equals methos*********");

		Hashtable st1 = new Hashtable();
		st1.put("A", "Sanjeev");
		st1.put("B", "QA");
		st1.put("C", "Selenium");
		//st1.put("C", "Selenium"); //It will be not printed 
		//System.out.println("Values of st1:::: ");
		//st1.put(null, "Selenium"); //null key are not allowed. It throws null pointer exception.
		//st1.put("D", null);// null values are not allowed. It throws null pointer exception.
		
		if (st.equals(st1)) {
			System.out.println("Values of object st and st1 are equal");
		} else {
			System.out.println("Values of object st and st1 are NOT equal");
		}

		// Get the value from a KEY
		System.out.println("\n*********Get the value from a KEY*********");
		System.out.println("\nValue of Key A:  " + st.get("A"));

		// Get the hashcode of Hashtable object:
		System.out.println("\n*********Get the hashcode of Hashtable object*********");
		System.out.println("\nThe Hash Code values of st1: " + st1.hashCode());
		
		//Define Generic:
		Hashtable<String, String> st3=new Hashtable<String, String>();
	}

}
