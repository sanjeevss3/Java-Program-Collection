package collection.listconcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SortInegerUsingArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		
		arrlist.add(6);
		arrlist.add(13);
		arrlist.add(5);
		arrlist.add(3);
		arrlist.add(1);
		
		System.out.println("Numbers before sorting");
		for(Integer counter : arrlist) {
			System.out.println(counter);
		}
		
		Collections.sort(arrlist);
		
		System.out.println("Numbers after sorting");
		for(Integer counter : arrlist) {
			System.out.println(counter);
		}
	}

}
