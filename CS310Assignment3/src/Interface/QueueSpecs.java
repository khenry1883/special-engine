package Interface;

public interface QueueSpecs<E> {

	public String toString();

	public boolean isEmpty();

	public void emptyQueue();

	public void enQ(E obj);

	public E deQ();

	public E peek();

}
