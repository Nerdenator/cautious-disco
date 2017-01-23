package c02_test;

import org.junit.Assert;
import org.junit.Test;

import c02_src.LinkedList;
import c02_src.P1_RemoveDuplicates;

public class P1_RemoveDuplicatesTest {
	LinkedList<Integer> list0 = new LinkedList<Integer>(new Integer[] {});
	//the dupes are inside and nonconsecutive
	LinkedList<Integer> list1 = new LinkedList<Integer>(new Integer[] { 1, 2, 3, 2, 4 });
	//the dupes are last and somewhere inside
	LinkedList<Integer> list2 = new LinkedList<Integer>(new Integer[] { 1, 2, 1, 4 });
	//the dupes are first and somewhere inside
	LinkedList<Integer> list3 = new LinkedList<Integer>(new Integer[] { 4, 1, 2, 1 });
	//the dupes are inside consecutive, >2
	LinkedList<Integer> list4 = new LinkedList<Integer>(new Integer[] { 1, 2, 2, 2, 4 });
	// the dupes are at the beginning
	LinkedList<Integer> list5 = new LinkedList<Integer>(new Integer[] { 1, 2, 2, 2, 2, 2 });
	// the dupes are at the end
	LinkedList<Integer> list6 = new LinkedList<Integer>(new Integer[] { 2, 2, 2, 2, 2, 1 });

	@Test
	public void testRemoveDupesHashTable() {
		Assert.assertEquals("[]", list0.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list0);
		Assert.assertEquals("[]", list0.toString());

		Assert.assertEquals("[4 -> 2 -> 3 -> 2 -> 1]", list1.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list1);
		Assert.assertEquals("[4 -> 2 -> 3 -> 1]", list1.toString());

		Assert.assertEquals("[4 -> 1 -> 2 -> 1]", list2.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list2);
		Assert.assertEquals("[4 -> 1 -> 2]", list2.toString());

		Assert.assertEquals("[1 -> 2 -> 1 -> 4]", list3.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list3);
		Assert.assertEquals("[1 -> 2 -> 4]", list3.toString());

		Assert.assertEquals("[4 -> 2 -> 2 -> 2 -> 1]", list4.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list4);
		Assert.assertEquals("[4 -> 2 -> 1]", list4.toString());

		Assert.assertEquals("[2 -> 2 -> 2 -> 2 -> 2 -> 1]", list5.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list5);
		Assert.assertEquals("[2 -> 1]", list5.toString());

		Assert.assertEquals("[1 -> 2 -> 2 -> 2 -> 2 -> 2]", list6.toString());
		P1_RemoveDuplicates.removeDupesHashTable(list6);
		Assert.assertEquals("[1 -> 2]", list6.toString());
	}

	@Test
	public void testRemoveDupesTwoNodes() {
		Assert.assertEquals("[]", list0.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list0);
		Assert.assertEquals("[]", list0.toString());

		Assert.assertEquals("[4 -> 2 -> 3 -> 2 -> 1]", list1.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list1);
		Assert.assertEquals("[4 -> 2 -> 3 -> 1]", list1.toString());

		Assert.assertEquals("[4 -> 1 -> 2 -> 1]", list2.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list2);
		Assert.assertEquals("[4 -> 1 -> 2]", list2.toString());

		Assert.assertEquals("[1 -> 2 -> 1 -> 4]", list3.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list3);
		Assert.assertEquals("[1 -> 2 -> 4]", list3.toString());

		Assert.assertEquals("[4 -> 2 -> 2 -> 2 -> 1]", list4.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list4);
		Assert.assertEquals("[4 -> 2 -> 1]", list4.toString());

		Assert.assertEquals("[2 -> 2 -> 2 -> 2 -> 2 -> 1]", list5.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list5);
		Assert.assertEquals("[2 -> 1]", list5.toString());

		Assert.assertEquals("[1 -> 2 -> 2 -> 2 -> 2 -> 2]", list6.toString());
		P1_RemoveDuplicates.removeDupesTwoNodes(list6);
		Assert.assertEquals("[1 -> 2]", list6.toString());
	}
}
