package c02_test;

import org.junit.Assert;
import org.junit.Test;

import c02_src.LinkedList;
import c02_src.P3_DeleteMiddleNode;

public class P3_DeleteMiddleNodeTest {

	LinkedList<Integer> list0 = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> list1 = new LinkedList<Integer>(new Integer[] { 1 });
	LinkedList<Integer> list2 = new LinkedList<Integer>(new Integer[] { 2, 1 });
	LinkedList<Integer> list3 = new LinkedList<Integer>(new Integer[] { 3, 2, 1 });

	@Test
	public void testDeleteMiddleNode() {
		Assert.assertFalse(P3_DeleteMiddleNode.deleteMiddleNode(list0.head));
		Assert.assertEquals("[]", list0.toString());
		Assert.assertFalse(P3_DeleteMiddleNode.deleteMiddleNode(list1.head));
		Assert.assertEquals("[1]", list1.toString());
		Assert.assertFalse(P3_DeleteMiddleNode.deleteMiddleNode(list2.head.next));
		Assert.assertEquals("[1 -> 2]", list2.toString());
		Assert.assertTrue(P3_DeleteMiddleNode.deleteMiddleNode(list3.head.next));
		Assert.assertEquals("[1 -> 3]", list3.toString());
	}

}
