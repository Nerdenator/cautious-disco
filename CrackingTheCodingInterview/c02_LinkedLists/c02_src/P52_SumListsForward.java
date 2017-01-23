package c02_src;

/**
 * Follow up:
 * Two numbers represented as linked lists, each item representing a single
 * digit, stored in forward order. Write a function that adds the two numbers
 * and returns the sum as a linked list.
 * Eg:
 * (6 -> 1 -> 7) + (2 -> 9 -> 5)
 * (9 -> 1 -> 2)
 * 
 * @author adina
 *
 */
public class P52_SumListsForward {

	/**
	 * Sum the two lists, iteratively
	 * 
	 * @param l1 first number in reverse order as a linked list
	 * @param l2 second number in reverse order as a linked list
	 * @return the sum of the two numbers, in reverse order, as a linked list
	 */
	public static LinkedList<Integer> sumListsForward(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		if ((l1 == null && l2 == null))
			return null;
		if (l1.isEmpty() && l2.isEmpty())
			return new LinkedList<Integer>();
		if (l1 == null || l1.isEmpty())
			return l2;
		if (l2 == null || l2.isEmpty())
			return l1;

		// if one of the lists is smaller, we need to pad it to align the units
		int sz1 = l1.size();
		int sz2 = l2.size();
		if (sz1 < sz2)
			padList(l1, sz2 - sz1);
		else
			padList(l2, sz1 - sz2);

		LinkedList<Integer> result = new LinkedList<>();
		result.head = sumListsForwardRecursive(l1.head, l2.head, new Node<Integer>(0));

		while (result.head.data == 0 && result.head.next != null)
			result.head = result.head.next;

		return result;
	}

	private static Node<Integer> sumListsForwardRecursive(Node<Integer> n1, Node<Integer> n2, Node<Integer> res) {
		if (n1 == null)
			return res;
		res = sumListsForwardRecursive(n1.next, n2.next, res);

		int sum = n1.data + n2.data + res.data;
		res.data = sum % 10;
		int carry = sum / 10;

		res = insertBeforeNode(res, carry);

		return res;
	}

	private static void padList(LinkedList<Integer> l1, int sz) {
		for (int i = 0; i < sz; i++)
			l1.addFirst(0);
	}

	private static Node<Integer> insertBeforeNode(Node<Integer> node, Integer value) {
		Node<Integer> nodenew = new Node<Integer>(value);
		nodenew.next = node;
		return nodenew;
	}
}
