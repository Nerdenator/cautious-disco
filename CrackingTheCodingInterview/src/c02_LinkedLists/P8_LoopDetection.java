package c02_LinkedLists;

/**
 * Given a circular linked list, find the node at the beginning of the loop
 * Ex:
 * A -> B -> C -> D -> E -> C (same C as earlier)
 * returns C
 * 
 * @author adina
 *
 */
public class P8_LoopDetection {
	/**
	 * 
	 * @param list
	 * @return the start node of the loop or null if no loop present
	 */
	public static Node<Integer> findLoopStart(LinkedList<Integer> list) {
		if (list == null || list.isEmpty())
			return null;

		Node<Integer> slow = list.head;
		Node<Integer> fast = list.head;

		// find if they ever intersect
		do {
			slow = slow.next;
			fast = fast.next.next;
		} while (slow != fast && fast != null && fast.next != null);

		// if they didn't intersect, return null
		if (fast != slow)
			return null;

		// start with fast from the beginning; the next point they intersect is
		// the start of the loop
		fast = list.head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
