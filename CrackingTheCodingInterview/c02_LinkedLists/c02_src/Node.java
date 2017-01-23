package c02_src;

/**
 * Helper class for linked list nodes
 * 
 * @author adina
 *
 * @param <T> the type of data in the node
 */
public class Node<T> {
	public Node<T> next;
	public T data;

	public Node() {
	}

	public Node(T data) {
		this.data = data;
	}
}
