package test;

import structures.OwnStack;

/**
 * Stack data structure, restricted access structure
 * Type: LIFO : Last In - First Out
 * Test for proves
 * Used I.D.E: Eclipse
 * @author Programming 3 class
 * @param <T> generic type of the stack
 */
public class TestMyStack {

	public static void main(String[] args) {
		OwnStack<String> myStack = new OwnStack<>();

		myStack.push("Maria");
		myStack.push("Daniela");
		myStack.push("Rocio");
		myStack.push("Alejandra");
		myStack.push("Yurani");
		myStack.push("Rosario");
		myStack.push("Lola");

		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}