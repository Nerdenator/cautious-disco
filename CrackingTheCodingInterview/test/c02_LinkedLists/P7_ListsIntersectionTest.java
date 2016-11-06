package c02_LinkedLists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P7_ListsIntersectionTest {
	LinkedList<Integer> l0 = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> list1 = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 9, 5, 1, 3 });
	LinkedList<Integer> list2 = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 6, 4 });
	LinkedList<Integer> a = new LinkedList<Integer>(new Integer[] { 9, 5, 1, 3 });
	LinkedList<Integer> b = new LinkedList<Integer>(new Integer[] { 6, 4 });
	LinkedList<Integer> e = new LinkedList<Integer>(new Integer[] { 1, 2, 7 });
	Node<Integer> inters;

	@Before
	public void setUp() {
		inters = e.head;
		Node<Integer> cur = a.head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = e.head;

		cur = b.head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = e.head;
	}

	@Test
	public void testSetUp() {
		Assert.assertEquals("[3 -> 1 -> 5 -> 9 -> 7 -> 2 -> 1]", list1.toString());
		Assert.assertEquals("[3 -> 1 -> 5 -> 9 -> 7 -> 2 -> 1]", a.toString());
		Assert.assertEquals("[4 -> 6 -> 7 -> 2 -> 1]", list2.toString());
		Assert.assertEquals("[4 -> 6 -> 7 -> 2 -> 1]", b.toString());
	}

	@Test
	public void testListIntersectionEmptyList() {
		Assert.assertNull(P7_ListsIntersection.findIntersection(null, a));
		Assert.assertNull(P7_ListsIntersection.findIntersection(b, null));
		Assert.assertNull(P7_ListsIntersection.findIntersection(a, l0));
		Assert.assertNull(P7_ListsIntersection.findIntersection(l0, e));
	}

	@Test
	public void testListIntersectionNoIntersection() {
		Assert.assertNull(P7_ListsIntersection.findIntersection(list1, list2));
		Assert.assertNull(P7_ListsIntersection.findIntersection(list1, a));
		Assert.assertNull(P7_ListsIntersection.findIntersection(a, list2));
		Assert.assertNull(P7_ListsIntersection.findIntersection(list2, list1));
	}

	@Test
	public void testListIntersectionIntersection() {
		Assert.assertEquals(inters, P7_ListsIntersection.findIntersection(a, b));
		Assert.assertEquals(inters, P7_ListsIntersection.findIntersection(b, a));
	}

}
