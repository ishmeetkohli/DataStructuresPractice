package DataStructures;

public class MyLinkedList {
	LinkedListNode head;

	public MyLinkedList() {
	}

	public MyLinkedList(LinkedListNode head) {
		this.head = head;
	}

	public LinkedListNode head() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	public void insert(int data) {
		if (this.head == null) {
			this.head = new LinkedListNode(data);
			return;
		}

		LinkedListNode current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new LinkedListNode(data);
	}

	public void delete(int data) {
		if (this.head.data == data) {
			this.head = this.head.next;
		}

		LinkedListNode current = this.head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
	}

	public void print() {
		LinkedListNode current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next();
		}
	}
}
