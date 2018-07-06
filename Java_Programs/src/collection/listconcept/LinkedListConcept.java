package collection.listconcept;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		// Add::
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RTF");
		ll.add("TestNG");

		// Print::
		System.out.println("Content of linked List: " + ll);

		// Add value before first element
		ll.addFirst("Sanjeev");

		// Add value after last element:
		ll.addLast("Chaudhary");

		System.out.println("Content of Linked List: " + ll);

		// Get method:
		System.out.println(ll.get(0));

		// set method: Overlapped the value which is at 0th position
		ll.set(0, "Vinay");
		System.out.println(ll.get(0));
		System.out.println("Content of Linked List: " + ll);

		// Remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of Linked List: " + ll);

		// Remove value using indexed position
		ll.remove(2);
		System.out.println("Content of Linked List: " + ll);

		// How to print all values of LinkedList:
		// for loop
		// advance for loop (for each)
		// iterator
		// while loop

		// for loop

		System.out.println("*****************Using for look*************");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		// advanced for loop
		System.out.println("*****************Using advanced(for each) for look*************");
		for (String str : ll) {
			System.out.println(str);
		}

		// Iterator
		System.out.println("*****************Using Iterator*************");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// While loop
		System.out.println("*****************Using while loop*************");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}
}
