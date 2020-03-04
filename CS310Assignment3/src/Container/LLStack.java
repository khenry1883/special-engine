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

	// override toString (display stack)
	@Override
	public String toString() {
		Node<E> curr = this.top;
		StringBuilder str = new StringBuilder();
		str.append("\n{");

		while (curr != null) {
			str.append("Data:" + curr.getData() + " ");
			curr = curr.getNextNode();
		}
		str.append("}");

		return str.toString();
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
		// TODO Auto-generated method stub

	}

	@Override
	public void push(E obj) { // always delete at beginning
		Node<E> newNode = new Node<E>(obj);
		newNode.setNextNode(this.top);
		this.top = newNode;

	}

	@Override
	public E pop() { // always delete at the beginning
		Node<E> toDel = this.top;
		this.top = this.top.getNextNode();
		return null;
	}

	@Override
	public E peek() {
		if (stackSize != 0) {
			return (E) top;
		} else {
			return null;
		}
	}

}
