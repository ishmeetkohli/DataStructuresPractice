package DataStructures;

public class LinkedListNode {
	int data;
	LinkedListNode next;

	public LinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}

	public int data() {
		return data;
	}

	public LinkedListNode next() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

}
