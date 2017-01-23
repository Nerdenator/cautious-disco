package c02_test;

import org.junit.Assert;
import org.junit.Test;

import c02_src.LinkedList;
import c02_src.P2_KthToLast;

public class P2_KthToLastTest {
	LinkedList<Integer> list0 = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> list = new LinkedList<Integer>(new Integer[] { 7, 6, 5, 4, 3, 2, 1 });

	@Test
	public void testKToLastSize() {
		Assert.assertNull(P2_KthToLast.kToLastSize(list0, 1));
		// last value
		Assert.assertEquals((Integer) 7, P2_KthToLast.kToLastSize(list, 1).data);
		// first value
		Assert.assertEquals((Integer) 1, P2_KthToLast.kToLastSize(list, 7).data);
		// other value
		Assert.assertEquals((Integer) 5, P2_KthToLast.kToLastSize(list, 3).data);
		// outside the list
		Assert.assertNull(P2_KthToLast.kToLastSize(list, 0));
		Assert.assertNull(P2_KthToLast.kToLastSize(list, -10));
		Assert.assertNull(P2_KthToLast.kToLastSize(list, 10));
	}

	@Test
	public void testKToLastTwoPointers() {
		Assert.assertNull(P2_KthToLast.kToLastTwoPointers(list0, 1));
		// last value
		Assert.assertEquals((Integer) 7, P2_KthToLast.kToLastTwoPointers(list, 1).data);
		// first value
		Assert.assertEquals((Integer) 1, P2_KthToLast.kToLastTwoPointers(list, 7).data);
		// other value
		Assert.assertEquals((Integer) 5, P2_KthToLast.kToLastTwoPointers(list, 3).data);
		// outside the list
		Assert.assertNull(P2_KthToLast.kToLastTwoPointers(list, 0));
		Assert.assertNull(P2_KthToLast.kToLastTwoPointers(list, -10));
		Assert.assertNull(P2_KthToLast.kToLastTwoPointers(list, 10));
	}

	@Test
	public void testKToLastRecursive() {
		Assert.assertNull(P2_KthToLast.kToLastRecursive(list0, 1));
		// last value
		Assert.assertEquals((Integer) 7, P2_KthToLast.kToLastRecursive(list, 1).data);
		// first value
		Assert.assertEquals((Integer) 1, P2_KthToLast.kToLastRecursive(list, 7).data);
		// other value
		Assert.assertEquals((Integer) 5, P2_KthToLast.kToLastRecursive(list, 3).data);
		// outside the list
		Assert.assertNull(P2_KthToLast.kToLastRecursive(list, 0));
		Assert.assertNull(P2_KthToLast.kToLastRecursive(list, -10));
		Assert.assertNull(P2_KthToLast.kToLastRecursive(list, 10));
	}
}
