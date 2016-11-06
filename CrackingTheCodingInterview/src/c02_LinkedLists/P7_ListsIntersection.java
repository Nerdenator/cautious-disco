package c02_LinkedLists;

/**
 * Given two singly linked lists, determine if they intersect and return the
 * intersecting node. Note: intersection is defined by reference and not value
 * 
 * @author adina
 *
 */
public class P7_ListsIntersection {

	/**
	 * Note that the last node in the lists will always be the same if there is
	 * an intersection. If so, chop off the beginning of the larger list, and
	 * compare each node of the two lists for identical nodes. Runtime is O(b)
	 * where b is the length of the longest list
	 * 
	 * @param l1 the first list
	 * @param l2 the second list
	 * @return the node at which the two lists intersect, or null otherwise
	 */
	public static Node<Integer> findIntersection(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		// intersecting with an empty/null list
		if (l1 == null || l2 == null || l1.isEmpty() || l2.isEmpty())
			return null;

		Node<Integer> n1 = l1.head;
		Node<Integer> n2 = l2.head;

		// find the size and last node of both lists --> O(b) where b is the
		// length of longer list
		int sz1 = 0;
		int sz2 = 0;

		// O(a), where a is the length of the shorter list
		while (n1.next != null && n2.next != null) {
			n1 = n1.next;
			sz1++;
			n2 = n2.next;
			sz2++;
		}
		// O(b-a), where b is the length of the longer list
		while (n1.next != null) {
			n1 = n1.next;
			sz1++;
		}
		while (n2.next != null) {
			n2 = n2.next;
			sz2++;
		}

		// if the last node is not the same, then the lists never intersect
		if (n1 != n2)
			return null;

		// advance b-a steps in the largest list, O(b-a)
		n1 = l1.head;
		n2 = l2.head;
		if (sz1 > sz2) {
			while (sz1 != sz2) {
				sz1--;
				n1 = n1.next;
			}
		} else {
			while (sz1 != sz2) {
				sz2--;
				n2 = n2.next;
			}
		}

		// find the first intersecting node, O(a)
		while (n1 != null) {
			if (n1 == n2)
				return n1;
			n1 = n1.next;
			n2 = n2.next;
		}

		return null;
	}
}
