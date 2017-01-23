package c02_src;

import java.util.HashSet;

/**
 * Remove duplicates from unsorted linked list
 * 
 * @author Adina
 *
 */
public class P1_RemoveDuplicates {

	/**
	 * Remove duplicates from list by checking if the next node is in a hash
	 * set
	 * O(n) time, O(n) additional space
	 */
	public static void removeDupesHashTable(LinkedList<Integer> list) {
		if (list.head == null)
			return;

		HashSet<Integer> table = new HashSet<>();

		// add the head to the hash set
		table.add(list.head.data);

		// current node, for list traversal
		Node<Integer> cur = list.head;

		// traverse until the next-to-last element
		while (cur.next != null && cur.next.next != null) {
			// check if the next element is in the table, and if so skip it
			if (table.contains(cur.next.data))
				cur.next = cur.next.next;
			// otherwise add it to the table and advance
			else {
				table.add(cur.next.data);
				cur = cur.next;
			}
		}
		// if the last element is in the table, remove it completely
		if (table.contains(cur.next.data))
			cur.next = null;
	}

	/**
	 * If no buffer allowed,
	 * use two pointers to check that the element doesn't repeat
	 * (similar to two nested for loops)
	 * O(n^2) time, O(1) space
	 */
	public static void removeDupesTwoNodes(LinkedList<Integer> list) {
		// two pointers, i and i, both starting at head
		Node<Integer> iNode = list.head;
		Node<Integer> jNode = list.head;

		// for every i, check all js that come after and skip over nodes that are duplicates
		// outer loop
		while (iNode != null && iNode.next != null) {
			jNode = iNode;
			//inner loop
			while (jNode.next != null) {
				// if it's a duplicate, skip over it
				if (iNode.data == jNode.next.data)
					jNode.next = jNode.next.next;
				// otherwise, continue
				else
					jNode = jNode.next;
			}
			// increase outer loop
			iNode = iNode.next;
		}
	}

}
