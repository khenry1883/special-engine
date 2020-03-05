package Container;

import Interface.StackSpecs;

public class LLStack<E> implements StackSpecs<E> {

	private Node<E> top; // mandatory variable
	private int stackSize; // mandatory variable

	// constructor
	LLStack() {
		this.top = top;
		this.stackSize = stackSize;
	}

	// getters and setters
	public void setTop(Node<E> top) {
		this.top = top;
	}

	public Node<E> getTop() {
		return this.top;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	public int getStackSize() {
		return this.stackSize;
	}

	// override toString (display stack)
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i <= stackSize; i++) {
			str += top.getData();
		}
		return str;
	}

	@Override
	public boolean isEmpty() {
		if (stackSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void emptyStack() {
		this.top = null;
		this.stackSize = 0;
	}

	@Override
	public void push(E obj) { // always delete at beginning
		Node<E> newNode = new Node<E>(obj);
		newNode.setNextNode(this.top);
		this.top = newNode;
		stackSize++;

	}

	@Override
	public E pop() { // always delete at the beginning
		Node<E> toDel = this.top;
		this.top = this.top.getNextNode();
		stackSize--;
		return null;
	}

	@Override
	public E peek() {
		if (stackSize != 0) {
			return (E) this.top;
		} else {
			return null;
		}
	}

}
