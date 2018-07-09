package collection.listconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SortAndRemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Vinay");
		al1.add("Lion");  
	    al1.add("Lion");
	    al1.add("Sanjeev");
	    al1.add("Sanjeev");
	    al1.add("Apple");
	    al1.add("Apple");  

	    System.out.println("\nArrayList with duplicates: " + al1);
	    
	    HashSet<String> hs1 = new HashSet<String>(al1);    // HashSet keeps only unique elements by default
	    System.out.println("\nArrayList without duplicates: " + hs1);                                                   
	    
	  //  ArrayList<String> al2 = new ArrayList<String>(hs1); // if you would like array list back
	  //  System.out.println("\nArrayList without duplicates: " + al2);  // if you would like the array list elements in sorted order
	    
	                                                         

	    TreeSet<String> s1 = new TreeSet<String>(al1);     // TreeSet sorts the elements by default
	    System.out.println("\nSortedSet elements: " + s1);// you can print like this also
	                                                       // if you would like array list back
	   // ArrayList<String> al3 = new ArrayList<String>(s1);
	   // System.out.println("\nArrayList without duplicates and in sorted order: " + al3);
	    
//	    Collections.sort(s1, Collections.reverseOrder());
//	    System.out.println("\nUnique values and Descending Order");
//	    for(String counter : s1) {
//	    	System.out.println(counter);
//	    }

	}

}
