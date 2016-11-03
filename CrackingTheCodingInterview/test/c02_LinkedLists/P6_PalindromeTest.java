package c02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

public class P6_PalindromeTest {
	LinkedList<Integer> l0 = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> l1 = new LinkedList<Integer>(new Integer[] { 1, 2, 3 });
	LinkedList<Integer> l2 = new LinkedList<Integer>(new Integer[] { 0, 1, 2, 1, 0 });
	LinkedList<Integer> l3 = new LinkedList<Integer>(new Integer[] { 5 });
	LinkedList<Integer> l4 = new LinkedList<Integer>(new Integer[] { 0, 1, 1, 0 });
	LinkedList<Integer> l5 = new LinkedList<Integer>(new Integer[] { 0, 1, 2, 0 });

	@Test
	public void testIsPalindromeReverseAndCompare() {
		// null list
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseAndCompare(null));
		// empty list
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseAndCompare(l0));
		// one-element list
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseAndCompare(l3));
		// not a palindrome
		Assert.assertFalse(P6_Palindrome.isPalindromeReverseAndCompare(l1));
		Assert.assertFalse(P6_Palindrome.isPalindromeReverseAndCompare(l5));
		// a palindrome
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseAndCompare(l2));
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseAndCompare(l4));
	}

	@Test
	public void testIsPalindromeReverseFirstHalfStack() {
		// null list
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseFirstHalfStack(null));
		// empty list
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseFirstHalfStack(l0));
		// one-element list
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseFirstHalfStack(l3));
		// not a palindrome
		Assert.assertFalse(P6_Palindrome.isPalindromeReverseFirstHalfStack(l1));
		Assert.assertFalse(P6_Palindrome.isPalindromeReverseFirstHalfStack(l5));
		// a palindrome
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseFirstHalfStack(l2));
		Assert.assertTrue(P6_Palindrome.isPalindromeReverseFirstHalfStack(l4));
	}

}
