package structures;

/**
 * Node for the stack data structure
 * @author augusticor
 * @param <T> generic type of the Stack
 */
public class Node<T> {

	/**Information of the node*/
	protected T info;
	/**Next node to this*/
	protected Node<T> next;

	public Node(T info, Node<T> next) {
		this.info = info;
		this.next = next;
	}

	public Node(T info){
		this.info = info;
		this.next = null;
	}

	/**
	 * @return the information in this node
	 */
	public T getInfo() {
		return info;
	}

	/**
	 * @return the next node to this
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * Sets the next node to this one
	 * @param next node to this
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
}