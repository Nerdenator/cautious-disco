package c02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

public class P5_SumListsReverseTest {

	LinkedList<Integer> l0 = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> l1 = new LinkedList<Integer>(new Integer[] { 6, 1, 7 });
	LinkedList<Integer> l2 = new LinkedList<Integer>(new Integer[] { 2, 9, 5 });
	LinkedList<Integer> l3 = new LinkedList<Integer>(new Integer[] { 5 });

	@Test
	public void testSumListsReverseIterative() {
		LinkedList<Integer> result = P5_SumListsReverse.sumListsReverseIterative(l1, l2);
		Assert.assertEquals("[2 -> 1 -> 9]", result.toString());

		result = P5_SumListsReverse.sumListsReverseIterative(l1, l1);
		Assert.assertEquals("[4 -> 3 -> 2 -> 1]", result.toString());

		result = P5_SumListsReverse.sumListsReverseIterative(l1, null);
		Assert.assertEquals(l1, result);

		result = P5_SumListsReverse.sumListsReverseIterative(l2, null);
		Assert.assertEquals(l2, result);

		result = P5_SumListsReverse.sumListsReverseIterative(null, null);
		Assert.assertNull(result);

		result = P5_SumListsReverse.sumListsReverseIterative(l0, l0);
		Assert.assertTrue(result.isEmpty());

		result = P5_SumListsReverse.sumListsReverseIterative(l0, l1);
		Assert.assertEquals(l1.toString(), result.toString());

		result = P5_SumListsReverse.sumListsReverseIterative(l3, l1);
		Assert.assertEquals("[2 -> 2 -> 6]", result.toString());

		result = P5_SumListsReverse.sumListsReverseIterative(l1, l3);
		Assert.assertEquals("[2 -> 2 -> 6]", result.toString());
	}

	@Test
	public void testSumListsReverseRecursive() {
		LinkedList<Integer> result = P5_SumListsReverse.sumListsReverseRecursive(l1, l2);
		Assert.assertEquals("[2 -> 1 -> 9]", result.toString());

		result = P5_SumListsReverse.sumListsReverseRecursive(l1, l1);
		Assert.assertEquals("[4 -> 3 -> 2 -> 1]", result.toString());

		result = P5_SumListsReverse.sumListsReverseRecursive(l1, null);
		Assert.assertEquals(l1, result);

		result = P5_SumListsReverse.sumListsReverseRecursive(l2, null);
		Assert.assertEquals(l2, result);

		result = P5_SumListsReverse.sumListsReverseRecursive(null, null);
		Assert.assertNull(result);

		result = P5_SumListsReverse.sumListsReverseRecursive(l0, l0);
		Assert.assertTrue(result.isEmpty());

		result = P5_SumListsReverse.sumListsReverseRecursive(l0, l1);
		Assert.assertEquals(l1.toString(), result.toString());

		result = P5_SumListsReverse.sumListsReverseRecursive(l3, l1);
		Assert.assertEquals("[2 -> 2 -> 6]", result.toString());

		result = P5_SumListsReverse.sumListsReverseRecursive(l1, l3);
		Assert.assertEquals("[2 -> 2 -> 6]", result.toString());
	}

}
