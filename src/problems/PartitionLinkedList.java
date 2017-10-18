package problems;

import DataStructures.MyLinkedList;
import DataStructures.LinkedListNode;

public class PartitionLinkedList {

	public LinkedListNode partition(MyLinkedList linkedList, int x) {
		LinkedListNode current = linkedList.head();
		LinkedListNode left = null, right = null, leftHead = null, rightHead = null;

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
