package collection.listconcept;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap is a class implements Map interface.
		//It contains only unique elements.
		//It store values in Key - Value pair
		//It may have one null key and multiple null values.
		//It maintains no order.
		
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	
	hm.put(1, "Selenium");
	hm.put(2, "QTP");
	hm.put(3, "Java");
	hm.put(4, "TestNG");
	System.out.println(hm.get(1));
	System.out.println(hm.get(4));
	
	for(java.util.Map.Entry<Integer, String> m : hm.entrySet()) {
		System.out.println(m.get);
	}
	
	}

}
