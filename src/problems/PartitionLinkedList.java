package problems;

import DataStructures.MyLinkedList;
import DataStructures.MyLinkedList.Node;

public class PartitionLinkedList {

	public Node partition(MyLinkedList linkedList, int x) {
		Node current = linkedList.head();
		Node left = null, right = null, leftHead = null, rightHead = null;

		while (current != null) {
			if (current.data() < x) {
				if (left == null) {
					left = current;
					leftHead = current;
				} else {
					left.setNext(current);
					left = current;
				}
			} else {
				if (right == null) {
					right = current;
					rightHead = current;
				} else {
					right.setNext(current);
					right = current;
				}
			}
			current = current.next();
		}

		left.setNext(rightHead);
		right.setNext(null);
		return leftHead;
	}
}
