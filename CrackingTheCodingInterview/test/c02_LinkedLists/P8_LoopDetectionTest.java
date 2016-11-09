package c02_LinkedLists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P8_LoopDetectionTest {
	LinkedList<Integer> empty = new LinkedList<Integer>(new Integer[] {});
	LinkedList<Integer> noLoop = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 9, 5, 1, 3 });
	LinkedList<Integer> oneLoop = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 9, 5, 1, 3 });
	Node<Integer> intersOneLoop;
	LinkedList<Integer> evenLoop = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 9, 5, 1, 3 });
	Node<Integer> intersEvenLoop;
	LinkedList<Integer> oddLoop = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 9, 5, 1, 3 });
	Node<Integer> intersOddLoop;
	LinkedList<Integer> fullLoop = new LinkedList<Integer>(new Integer[] { 1, 2, 7, 9, 5, 1, 3 });
	Node<Integer> intersFullLoop;

	@Before
	public void setUp() {
		// create oneLoop list
		intersOneLoop = oneLoop.head.next.next.next.next.next;
		Node<Integer> tail = oneLoop.head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = intersOneLoop;

		// create evenLoop list
		intersEvenLoop = evenLoop.head.next.next;
		tail = evenLoop.head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = intersEvenLoop;

		// create fullLoop list
		intersFullLoop = fullLoop.head;
		tail = fullLoop.head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = intersFullLoop;
	}

	@Test
	public void test() {
		Assert.assertNull(P8_LoopDetection.findLoopStart(null));
		Assert.assertNull(P8_LoopDetection.findLoopStart(empty));
		Assert.assertNull(P8_LoopDetection.findLoopStart(noLoop));
		Assert.assertEquals(intersOneLoop, P8_LoopDetection.findLoopStart(oneLoop));
		Assert.assertEquals(intersOddLoop, P8_LoopDetection.findLoopStart(oddLoop));
		Assert.assertEquals(intersEvenLoop, P8_LoopDetection.findLoopStart(evenLoop));
		Assert.assertEquals(intersFullLoop, P8_LoopDetection.findLoopStart(fullLoop));
	}

}
