package problems;

import DataStructures.MyLinkedList;
import DataStructures.MyLinkedList.Node;

public class RemoveDups {

	public void removeDups(MyLinkedList linkedList) {
		Node current = linkedList.head();
		while (current.next() != null) {
			Node runner = current;
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
