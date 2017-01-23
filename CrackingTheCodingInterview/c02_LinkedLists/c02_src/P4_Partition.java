package c02_src;

/**
 * Partition a Linked List around a value x, s.t nodes < x come before nodes >=x
 * Eg:
 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]
 * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 * 
 * @author adina
 *
 */
public class P4_Partition {
	public static void partitionStable(LinkedList<Integer> list, int x) {
		if (list.head == null)
			return;

		Node<Integer> cur = list.head;

		Node<Integer> ltx = null;
		Node<Integer> ltxStart = null;
		Node<Integer> gtex = null;
		Node<Integer> gtexStart = null;

		while (cur != null) {
			// first half
			if (cur.data < x) {
				if (ltx == null) {
					// create the new list and save the start and end points
					ltxStart = cur;
					ltx = ltxStart;
				} else {
					// save the end point and advance
					ltx.next = cur;
					ltx = ltx.next;
				}
			}
			// second half
			else {
				if (gtex == null) {
					// create a new list and save the start and end points
					gtexStart = cur;
					gtex = gtexStart;
				} else {
					// save the end point and advance
					gtex.next = cur;
					gtex = gtex.next;
				}

			}
			cur = cur.next;
		}
		// if there are no elements less than x
		if (ltxStart == null)
			list.head = gtexStart;
		// merge
		else {
			ltx.next = gtexStart;
			gtex.next = null;
			list.head = ltxStart;
		}
	}

	/**
	 * Not a stable partition: every time we insert an element, add it either to
	 * first half or second half
	 * 
	 * @param list
	 * @param x
	 */
	public static void partitionNotStable(LinkedList<Integer> list, int x) {
		if (list.head == null)
			return;

		Node<Integer> cur = list.head;

		Node<Integer> first = cur;
		Node<Integer> second = cur;

		while (cur != null) {
			Node<Integer> next = cur.next;
			if (cur.data < x) {
				// insert at beginning
				cur.next = first;
				first = cur;
			}// 
			else {
				// insert at end
				second.next = cur;
				second = cur;
			}
			cur = next;
		}
		second.next = null;
		list.head = first;
	}
}
