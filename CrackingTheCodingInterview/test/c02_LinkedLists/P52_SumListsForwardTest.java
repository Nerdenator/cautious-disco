package c02_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

public class P52_SumListsForwardTest {

	LinkedList<Integer> l0 = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> l1 = new LinkedList<Integer>(new Integer[] { 7, 1, 6 });
	LinkedList<Integer> l2 = new LinkedList<Integer>(new Integer[] { 5, 9, 2 });
	LinkedList<Integer> l3 = new LinkedList<Integer>(new Integer[] { 5 });

	@Test
	public void testSumListsForwardIterative() {
		LinkedList<Integer> result = P52_SumListsForward.sumListsForward(l1, l2);
		Assert.assertEquals("[9 -> 1 -> 2]", result.toString());

		result = P52_SumListsForward.sumListsForward(l1, l1);
		Assert.assertEquals("[1 -> 2 -> 3 -> 4]", result.toString());

		result = P52_SumListsForward.sumListsForward(l1, null);
		Assert.assertEquals(l1, result);

		result = P52_SumListsForward.sumListsForward(l2, null);
		Assert.assertEquals(l2, result);

		result = P52_SumListsForward.sumListsForward(null, null);
		Assert.assertNull(result);

		result = P52_SumListsForward.sumListsForward(l0, l0);
		Assert.assertTrue(result.isEmpty());

		result = P52_SumListsForward.sumListsForward(l0, l1);
		Assert.assertEquals(l1.toString(), result.toString());

		result = P52_SumListsForward.sumListsForward(l3, l1);
		Assert.assertEquals("[6 -> 2 -> 2]", result.toString());

		result = P52_SumListsForward.sumListsForward(l1, l3);
		Assert.assertEquals("[6 -> 2 -> 2]", result.toString());
	}

}
