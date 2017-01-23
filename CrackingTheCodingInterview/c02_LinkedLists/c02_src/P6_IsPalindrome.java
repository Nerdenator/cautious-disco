package c02_src;

import java.util.Stack;

/**
 * Implement a function to check if a linked list is a palindrome
 * 
 * @author adina
 *
 */
public class P6_IsPalindrome {
	/**
	 * First reverse the list and then make sure the two lists are equal Note:
	 * comparison can only go to half the list, but not worth computing size
	 * 
	 * @param list
	 * @return whether the list and the reversed list are equal, thus a
	 *         palindrome
	 */
	public static boolean isPalindromeReverseAndCompare(LinkedList<Integer> list) {
		// empty list or one-element list is a palindrome
		if (list == null || list.isEmpty() || list.head.next == null)
			return true;
		// reverse the linked list
		LinkedList<Integer> reversed = reverse(list);
		// compare the two lists
		return isEqual(list, reversed);
	}

	/**
	 * Is l1 equal to l2, element-wise?
	 * 
	 * @param l1
	 * @param l2
	 * @return if the two lists are equal in content
	 */
	private static boolean isEqual(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		Node<Integer> n1 = l1.head;
		Node<Integer> n2 = l2.head;
		while (n1 != null && n2 != null) {
			if (n1.data != n2.data)
				return false;
			n1 = n1.next;
			n2 = n2.next;
		}
		if (n1 != null || n2 != null)
			return false;
		return true;
	}

	/**
	 * Reverse the contents of list, and return the reversed list
	 * 
	 * @param list
	 *            the list to be reversed
	 * @return the reversed list
	 */
	private static LinkedList<Integer> reverse(LinkedList<Integer> list) {
		Node<Integer> n1 = list.head;
		LinkedList<Integer> reversed = new LinkedList<>(n1.data);
		while (n1.next != null) {
			n1 = n1.next;
			reversed.addFirst(n1.data);
		}
		return reversed;
	}

	/**
	 * Use fast pointer and slow pointer to get half of class, and add value
	 * slow pointer points at to a stack. Then pop from the stack comparing with
	 * remainder of list.
	 * 
	 * @param list
	 * @return is the list a palindrome
	 */
	public static boolean isPalindromeReverseFirstHalfStack(LinkedList<Integer> list) {
		// empty list or one-element list is a palindrome
		if (list == null || list.isEmpty() || list.head.next == null)
			return true;
		Node<Integer> fast = list.head.next;
		Node<Integer> slow = list.head;

		// add to stack until fast reaches end of list
		Stack<Integer> stack = new Stack<>();
		stack.add(slow.data);
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
			// don't double add the data
			if (fast != null) {
				stack.add(slow.data);
				fast = fast.next;
			}
		}
		// check if first half matches second half
		while (slow != null) {
			if (slow.data != stack.pop())
				return false;
			slow = slow.next;
		}

		return true;
	}

	static class Result {
		Node<Integer> node;
		boolean isPalindrome;

		Result(Node<Integer> node, boolean isPalindrome) {
			this.node = node;
			this.isPalindrome = isPalindrome;
		}
	}

	public static boolean isPalindromeRecursive(LinkedList<Integer> list) {
		if (list == null)
			return true;
		// use the private method given the current node and the list size
		return isPalindromeRecursive(list.head, list.size()).isPalindrome;
	}

	private static Result isPalindromeRecursive(Node<Integer> node, int size) {
		// the middle is always true, and so is an empty node
		// even number of nodes
		if (node == null || size == 0)
			return new Result(node, true);
		// odd number of nodes, pass next node
		if (size == 1)
			return new Result(node.next, true);

		// recurse
		Result res = isPalindromeRecursive(node.next, size - 2);

		// if the node is not a palindrome, pass failure up
		if (res.isPalindrome == false || res.node == null)
			return res;

		// if the two nodes match, then pass success, otherwise pass failure
		res.isPalindrome = (node.data == res.node.data);

		// advance the corresponding node
		res.node = res.node.next;

		return res;
	}

}
