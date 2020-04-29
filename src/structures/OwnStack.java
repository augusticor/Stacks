package structures;

/**
 * Stack data structure, restricted access structure, type 
 * LIFO : Last In - First Out
 * @author Programming 3 class
 * @param <T> generic type of the stack
 */
public class OwnStack<T> {

	/**Last element added*/
	private Node<T> top;
	
	public OwnStack() {
		top = null;
	}
	
	public OwnStack(OwnStack<T> stack) {
		this.top = stack.top;
	}

	/**
	 * @return if the stack is empty
	 */
	public boolean isEmpty() {
		return (top == null);
	}
	
	/**
	 * Adds information to the stack
	 */
	public void push(T info) {
		top = new Node<>(info, top);
	}
	
	/**
	 * Gets the last element of the stack
	 * @return the last element added
	 */
	public T pop() {
		T aux = top.info;
		top = top.next;
		return aux;
	}
}