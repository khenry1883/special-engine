package Container;

import Interface.QueueSpecs;

public class StackQ<E> implements QueueSpecs<E> {

	private LLStack<E> enQStack; // mandatory variable
	private LLStack<E> deQStack; // mandatory variable

	// constructor
	StackQ() {
		this.enQStack = enQStack;
		this.deQStack = deQStack;
	}
	// override toString

	@Override
	public boolean isEmpty() {
		if (enQStack.isEmpty() && deQStack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void emptyQueue() {
		enQStack.emptyStack();
		deQStack.emptyStack();
	}

	@Override
	public void enQ(E obj) {
		enQStack.push(obj); // Add new node to the top of the enQStack
	}

	@Override
	public E deQ() {
		if (!deQStack.isEmpty()) {
			return deQStack.pop(); // pop the topmost element from deQStack
		} else {
			while (!enQStack.isEmpty()) {
				E temp = enQStack.pop();
				deQStack.push(temp);
			}
			return deQ();
		}
	}

	@Override
	public E peek() {
		if (deQStack != null && enQStack != null) {
			return deQStack.peek(); // use stack's peek method
		}
		return null;
	}

}
