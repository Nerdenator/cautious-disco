package c02_LinkedLists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	LinkedList<Integer> list;
	LinkedList<Integer> empty;
	LinkedList<Integer> one;

	@Before
	public void setUp() {
		empty = new LinkedList<>();
		one = new LinkedList<>(10);
		list = new LinkedList<>(new Integer[] { 1, 2, 4, 7, 2, 3 });
	}

	@Test
	public void testSetup() {
		assertEquals("[]", empty.toString());
		assertEquals("[10]", one.toString());
		assertEquals("[3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
	}

	@Test
	public void testEmpty() {
		assertTrue(empty.isEmpty());
		assertFalse(list.isEmpty());
	}

	@Test
	public void testSize() {
		Assert.assertEquals(0, empty.size());
		Assert.assertEquals(1, one.size());
		Assert.assertEquals(6, list.size());
	}

	@Test
	public void testAddFirst() {
		empty.addFirst(10);
		assertEquals("[10]", empty.toString());

		one.addFirst(20);
		assertEquals("[20 -> 10]", one.toString());

		list.addFirst(10);
		assertEquals("[10 -> 3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
	}

	@Test
	public void testRemoveFirst() {
		Node<Integer> rem = null;

		rem = empty.removeFirst();
		assertEquals("[]", empty.toString());
		assertNull(rem);

		rem = one.removeFirst();
		assertEquals("[]", one.toString());
		assertEquals((Integer) 10, rem.data);

		rem = list.removeFirst();
		assertEquals("[2 -> 7 -> 4 -> 2 -> 1]", list.toString());
		assertEquals((Integer) 3, rem.data);
	}

	@Test
	public void testFindValue() {
		Node<Integer> found = null;

		found = empty.find(10);
		assertEquals("[]", empty.toString());
		assertNull(found);

		found = one.find(20);
		assertEquals("[10]", one.toString());
		assertNull(found);

		found = one.find(10);
		assertEquals("[10]", one.toString());
		assertEquals((Integer) 10, found.data);

		found = list.find(10);
		assertEquals("[3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
		assertNull(found);

		found = list.find(3);
		assertEquals("[3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
		assertEquals((Integer) 3, found.data);

		found = list.find(7);
		assertEquals("[3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
		assertEquals((Integer) 7, found.data);

		found = list.find(1);
		assertEquals("[3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
		assertEquals((Integer) 1, found.data);
	}

	@Test
	public void testDeleteValue() {
		Node<Integer> rem = null;

		rem = empty.delete(10);
		assertEquals("[]", empty.toString());
		assertNull(rem);

		rem = one.delete(20);
		assertEquals("[10]", one.toString());
		assertNull(rem);

		rem = one.delete(10);
		assertEquals("[]", one.toString());
		assertEquals((Integer) 10, rem.data);

		rem = list.delete(20);
		assertEquals("[3 -> 2 -> 7 -> 4 -> 2 -> 1]", list.toString());
		assertNull(rem);

		rem = list.delete(4);
		assertEquals("[3 -> 2 -> 7 -> 2 -> 1]", list.toString());
		assertEquals((Integer) 4, rem.data);

		rem = list.delete(1);
		assertEquals("[3 -> 2 -> 7 -> 2]", list.toString());
		assertEquals((Integer) 1, rem.data);

		rem = list.delete(2);
		assertEquals("[3 -> 7 -> 2]", list.toString());
		assertEquals((Integer) 2, rem.data);

		rem = list.delete(2);
		assertEquals("[3 -> 7]", list.toString());
		assertEquals((Integer) 2, rem.data);

		rem = list.delete(3);
		assertEquals("[7]", list.toString());
		assertEquals((Integer) 3, rem.data);

		rem = list.delete(7);
		assertEquals("[]", list.toString());
		assertEquals((Integer) 7, rem.data);
	}

}
