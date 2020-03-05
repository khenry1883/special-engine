package Container;

public class Node<E> {

	private E data; // mandatory variable
	private Node<E> nextNode; // mandatory variable

	// constructor
	Node() {
		this.data = data;
		this.nextNode = nextNode;
	}

	// overwrite toString method
	public String toString() {
		String str = "";
		str += getData();
		return str;
	}

	public Node(E data) {
		this(data, null);
	}

	public Node(E data, Node<E> node) {
		this.data = data;
		this.nextNode = node;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}

}
