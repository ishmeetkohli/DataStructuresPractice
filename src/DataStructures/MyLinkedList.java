package DataStructures;

public class MyLinkedList {
	Node head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int data() {
			return data;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setData(int data) {
			this.data = data;
		}

	}

	public Node head() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insert(int data) {
		if (this.head == null) {
			this.head = new Node(data);
			return;
		}

		Node current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void delete(int data) {
		if (this.head.data == data) {
			this.head = this.head.next;
		}

		Node current = this.head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next();
		}
	}
}
