package c02_src;

/**
 * Find the kth to last element in a singly linked list
 * k=1 returns last element, k=1 returns 2nd to last element etc.
 * 
 * @author Adina
 */
public class P2_KthToLast {

	/**
	 * Use the size of the array and return item at position size-k
	 * O(n) to get size, O(n) to find value
	 * 
	 * @param list
	 * @param k
	 * @return k-to-last node
	 */
	public static Node<Integer> kToLastSize(LinkedList<Integer> list, int k) {
		if (k <= 0)
			return null;
		// get the size of the list
		int size = list.size();
		if (k > size)
			return null;
		// go through the list until size-k
		Node<Integer> cur = list.head;
		for (int i = 0; i < size - k; i++) {
			cur = cur.next;
		}
		return cur;
	}

	/**
	 * Use two pointers: fast is k steps ahead of slow, so when fast reaches
	 * null, slow is at the element we're interested in
	 * O(n)
	 * 
	 * @param list
	 * @param k
	 * @return k-to-last node
	 */
	public static Node<Integer> kToLastTwoPointers(LinkedList<Integer> list, int k) {
		if (k <= 0)
			return null;
		Node<Integer> slow = list.head;
		Node<Integer> fast = list.head;

		//advance fast k steps
		for (int i = 0; i < k; i++) {
			if (fast == null)
				return null;
			fast = fast.next;
		}
		// move fast and slow together until end of list
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}

	/**
	 * Recursively retrieve the element by keeping track of how many passes have
	 * been made and the node that was last seen
	 */
	static int count;
	static Node<Integer> passBack;

	public static Node<Integer> kToLastRecursive(LinkedList<Integer> list, int k) {
		if (k <= 0)
			return null;
		count = 0;
		passBack = null;
		return kToLastRecursive(list.head, k);
	}

	private static Node<Integer> kToLastRecursive(Node<Integer> head, int k) {
		if (head == null) {
			return null;
		}

		passBack = kToLastRecursive(head.next, k);
		count++;

		if (count == k)
			return head;

		return passBack;
	}

}
