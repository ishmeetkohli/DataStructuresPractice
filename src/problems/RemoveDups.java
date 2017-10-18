package problems;

import DataStructures.MyLinkedList;
import DataStructures.LinkedListNode;

public class RemoveDups {

	public void removeDups(MyLinkedList linkedList) {
		LinkedListNode current = linkedList.head();
		while (current.next() != null) {
			LinkedListNode runner = current;
			while (runner.next() != null) {
				if (runner.next().data() == current.data()) {
					runner.setNext(runner.next().next());
				} else {
					runner = runner.next();
				}
			}
			current = current.next();
		}
	}
}
