package Container;

import Interface.QueueSpecs;

public class StackQ<E> implements QueueSpecs<E> {

	private LLStack<E> enQStack; // mandatory variable
	private LLStack<E> deQStack; // mandatory variable
	public int queueSize = 0; // custom

	// constructor
	public StackQ() {
		this.enQStack = new LLStack<E>();
		this.deQStack = new LLStack<E>();
		this.queueSize = queueSize;
	}

	// getters and setters
	public void setEnQStack(LLStack<E> enQStack) {
		this.enQStack = enQStack;
	}

	public LLStack<E> getEnQStack() {
		return enQStack;
	}

	public void setDeQStack(LLStack<E> deQStack) {
		this.deQStack = deQStack;
	}

	public LLStack<E> getDeQStack() {
		return deQStack;
	}

	// override toString
	@Override
	public String toString() {
		if (this.getDeQStack().isEmpty()) {
			while (!this.getEnQStack().isEmpty()) {
				this.getDeQStack().push(this.getEnQStack().pop());
			}
		}
		return " " + this.getDeQStack().toString() + this.getEnQStack().toString();
	}

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
		queueSize = 0;
	}

	@Override
	public void enQ(E obj) {
		enQStack.push(obj); // Add new node to the top of the enQStack
		queueSize++;
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
			queueSize--;
			return deQ();
		}
	}

	@Override
	public E peek() {
		if (deQStack != null && enQStack != null) {
			return enQStack.peek(); // use stack's peek method
		}
		return null;
	}

}
