package c02_src;

/**
 * Delete the node in the middle of a singly linked list, given only access to
 * that node
 * 
 * eg: delete node c from a->b->c->d->e
 * ....new list looks like: a->b->d->e
 * 
 * @author adina
 *
 */
public class P3_DeleteMiddleNode {
	/**
	 * Delete middle node given only access to middle node
	 * Solution: shift next node (mid.next) left and delete node (mid.next)
	 * If node is last node then we can't remove it
	 * 
	 * @param mid
	 * @return success or failure
	 */
	public static boolean deleteMiddleNode(Node<Integer> mid) {
		if (mid == null || mid.next == null)
			return false;

		Node<Integer> next = mid.next;
		mid.data = next.data;
		mid.next = next.next;
		return true;
	}
}
