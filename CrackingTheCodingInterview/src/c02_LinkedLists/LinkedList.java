package c02_LinkedLists;

/**
 * Singly linked list
 * 
 * @author adina
 *
 */
public class LinkedList<T> {
	Node<T> head;

	/* Constructors */
	public LinkedList() {
		head = null;
	}

	public LinkedList(T data) {
		head = new Node<>(data);
		head.next = null;
	}

	public LinkedList(T[] array) {
		for (T data : array)
			addFirst(data);
	}

	/* Add to the beginning of the list */
	public void addFirst(T data) {
		if (head == null) {
			head = new Node<>(data);
			return;
		}
		Node<T> temp = new Node<>(data);
		temp.next = head;
		head = temp;
	}

	/* Remove from the beginning of the list */
	public Node<T> removeFirst() {
		if (head == null)
			return null;
		Node<T> temp = head;
		head = head.next;
		return temp;
	}

	/* Find the first node containing value*/
	public Node<T> find(T value) {
		if (head == null)
			return null;
		Node<T> cur = head;
		while (cur != null && !cur.data.equals(value))
			cur = cur.next;
		return cur;
	}

	/* Delete the node containing value */
	public Node<T> delete(T value) {
		if (head == null)
			return null;
		if (head.data == value) {
			Node<T> cur = head;
			removeFirst();
			return cur;
		}

		Node<T> cur = head;

		// find node before value
		while (cur != null && cur.next != null && !cur.next.data.equals(value))
			cur = cur.next;

		Node<T> temp = cur.next;

		if (cur.next == null)
			cur = null;
		else
			cur.next = cur.next.next;

		return temp;
	}

	public int size() {
		Node<T> cur = head;
		int sz = 0;
		while (cur != null) {
			cur = cur.next;
			sz++;
		}
		return sz;
	}

	/**
	 * Convert to string for tests
	 */
	@Override
	public String toString() {
		if (head == null)
			return "[]";

		StringBuilder sb = new StringBuilder();

		// iterate from head to node before tail
		Node<T> cur = head;
		while (cur.next != null) {
			sb.append(cur.data + " -> ");
			cur = cur.next;
		}
		// append tail
		sb.append(cur.data);
		return "[" + sb + "]";
	}
}
