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
		if(enQStack.top == null || deQStack.top == null)){
			return true;
		} else { 
			return false;
		}
	}

	@Override
	public void emptyQueue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enQ(E obj) {
		// Add new node to the top of the enQStack
		// Empty condition for the enQStack is only to maintain the top reference

	}

	@Override
	public E deQ() {
		// pop the topmost element from deQStack
		// if deQStack is empty, pop all the elements from the enQStack and push them
		// one by one into the deQStack then pop from deQStack to perform deQ()
		return null;
	}

	@Override
	public E peek() {

		return null;
	}

}
