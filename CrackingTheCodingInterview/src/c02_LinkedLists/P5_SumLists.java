package c02_LinkedLists;

/**
 * Two numbers represented as linked lists, each item representing a single
 * digit, stored in reverse order. Write a function that adds the two numbers
 * and returns the sum as a linked list.
 * Eg:
 * (7 -> 1 -> 6) + (5 -> 9 -> 2) .... [617 + 295]
 * (2 -> 1 -> 9) .................... [912]
 * 
 * Follow up: what if digits are stored in forward order?
 * (6 -> 1 -> 7) + (2 -> 9 -> 5)
 * (9 -> 1 -> 2)
 * 
 * @author adina
 *
 */
public class P5_SumLists {

	/**
	 * Sum the two lists, iteratively
	 * 
	 * @param l1 first number in reverse order as a linked list
	 * @param l2 second number in reverse order as a linked list
	 * @return the sum of the two numbers, in reverse order, as a linked list
	 */
	public static LinkedList<Integer> sumReverseListIterative(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		if ((l1 == null && l2 == null) || l1.isEmpty() && l2.isEmpty())
			return null;
		if (l1 == null || l1.isEmpty())
			return l2;
		if (l2 == null || l2.isEmpty())
			return l1;

		// go through each element of l1 and l2
		Node<Integer> n1 = l1.head;
		Node<Integer> n2 = l2.head;
		// stores the result as 1-digit elements
		Node<Integer> r = null;
		// stores the beginning of the result array
		Node<Integer> startR = null;

		int carry = 0;
		// continue until end of both lists
		while (n1 != null || n2 != null) {
			// sum is the sum of current digits + carry
			int sum = carry;
			if (n1 != null)
				sum += n1.data;
			if (n2 != null)
				sum += n2.data;
			// start a new result list
			if (r == null) {
				r = new Node<>(sum % 10);
				startR = r;
			}
			// add to the existing result list
			else {
				r.next = new Node<>(sum % 10);
				r = r.next;
			}
			// the carry is the tens of the sum
			carry = sum / 10;

			// advance both numbers
			if (n1 != null)
				n1 = n1.next;
			if (n2 != null)
				n2 = n2.next;
		}
		// if we have a carry left, add it to the "beginning" of the result
		if (carry != 0)
			r.next = new Node<>(carry);

		// return a linked list starting at startR
		LinkedList<Integer> result = new LinkedList<>();
		result.head = startR;
		return result;
	}

	/**
	 * Sum the two lists, recursively
	 * 
	 * @param l1 first number in reverse order as a linked list
	 * @param l2 second number in reverse order as a linked list
	 * @return the sum of the two numbers, in reverse order, as a linked list
	 */
	public static LinkedList<Integer> sumReverseListRecursive(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		if ((l1 == null && l2 == null) || l1.isEmpty() && l2.isEmpty())
			return null;
		if (l1 == null || l1.isEmpty())
			return l2;
		if (l2 == null || l2.isEmpty())
			return l1;
		LinkedList<Integer> result = new LinkedList<>();
		result.head = sumReverseListRecursive(l1.head, l2.head, 0);
		return result;
	}

	/**
	 * Actual recursive call
	 * 
	 * @param n1
	 * @param n2
	 * @param carry
	 * @return returns the head of the new list
	 */
	private static Node<Integer> sumReverseListRecursive(Node<Integer> n1, Node<Integer> n2, int carry) {
		// base case, when there isn't any carry left
		if (n1 == null && n2 == null && carry == 0)
			return null;
		Node<Integer> result = new Node<>();
		// sum is the sum of current digits + carry
		int sum = carry;
		if (n1 != null)
			sum += n1.data;
		if (n2 != null)
			sum += n2.data;
		result.data = sum % 10;
		if (n1 != null || n2 != null) {
			Node<Integer> n1_next = null;
			if (n1 != null)
				n1_next = n1.next;
			Node<Integer> n2_next = null;
			if (n2 != null)
				n2_next = n2.next;
			Node<Integer> next = sumReverseListRecursive(n1_next, n2_next, sum / 10);
			result.next = next;
		}
		return result;
	}
}
